package com.eu.modris;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import androidx.loader.content.AsyncTaskLoader;

import java.io.IOException;


public class LoginAsyncTask extends AsyncTask<String, String, Boolean> {
    private static final String TAG = "LoginAsyncTask";

    private RESTConnector connector = new RESTConnector();

    private Activity activity;

    public LoginAsyncTask(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected Boolean doInBackground(String... strings) {
        try {
            connector.login(strings[0], strings[1]);

            return true;

        } catch (IOException ioException){
            Log.e(TAG, "Login Error: " + ioException.getMessage(), ioException);
        }
        catch (UnauthorizedLoginException e){
            Log.e(TAG, "Unauthorized Login");
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        if (aBoolean) {
            Intent intent = new Intent(activity, SportsList.class);
            activity.startActivity(intent);
        }
    }
}
