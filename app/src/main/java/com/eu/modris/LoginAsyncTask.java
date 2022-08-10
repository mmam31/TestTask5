package com.eu.modris;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import androidx.loader.content.AsyncTaskLoader;

import java.io.IOException;


public class LoginAsyncTask extends AsyncTask<String, String, Boolean> {
    private static final String TAG = "LoginAsyncTask";

    private RESTConnector connector = new RESTConnector();

    @Override
    protected Boolean doInBackground(String... strings) {
        try {
            connector.login(username.getText().toString(), password.getText().toString());

            return true;

        } catch (IOException ioException){
            Log.e(TAG, "Login Error", ioException);
        }
        catch (UnauthorizedLoginException e){
            Log.e(TAG, "Unauthorized Login");
        }
        return false;
    }
}
