package com.eu.modris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SportsList extends AppCompatActivity {

    private Button americanFootballBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_list);

        americanFootballBtn = (Button) findViewById(R.id.loginButton);
        americanFootballBtn.setOnClickListener(view -> openSportsDetails());
    }

    public void openSportsDetails() {
        Intent intent = new Intent(this, SportsDetails.class);
        startActivity(intent);
    }
}