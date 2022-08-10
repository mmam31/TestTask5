package com.eu.modris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SportsList extends AppCompatActivity {

    private Button americanFootballBtn;

    String[] mobileArray = {"American Football", "Basketball", "Cricket", "Mixed martial Arts",
            "Rugby League", "Soccer"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.list_of_sports, mobileArray);
        ListView listView = findViewById(R.id.sportsList);
        listView.setAdapter(adapter);

//        americanFootballBtn = (Button) findViewById(R.id.button);
//        americanFootballBtn.setOnClickListener(view -> openSportsDetails());
//    }
//
//    public void openSportsDetails() {
//        Intent intent = new Intent(this, SportsDetails.class);
//        startActivity(intent);
//    }
    }
}