package com.eu.modris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.loginButton);
        button1.setOnClickListener(view -> openSportsList());

    }

    public void openSportsList(){
        Intent intent = new Intent(this, SportsList.class);
        startActivity(intent);
    }
}