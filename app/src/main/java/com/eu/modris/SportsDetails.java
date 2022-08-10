package com.eu.modris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SportsDetails extends AppCompatActivity {
    private Button backButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots_details);

        backButton = (Button) findViewById(R.id.btnBack);
        backButton.setOnClickListener(view -> openSportsList());
    }

    public void openSportsList(){
        Intent intent = new Intent(this, SportsList.class);
        startActivity(intent);
    }
}