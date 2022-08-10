package com.eu.modris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RESTConnector connector = new RESTConnector();


    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.loginButton);
        button1.setOnClickListener(view -> openSportsList());

//        TextView username = (TextView) findViewById(R.id.username);
//        TextView password = (TextView) findViewById(R.id.password);

    }

    public void openSportsList() {
//        Intent intent = new Intent(this, SportsList.class);
//        startActivity(intent);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        new LoginAsyncTask(this).execute(username.getText().toString(), password.getText().toString());
    }
}