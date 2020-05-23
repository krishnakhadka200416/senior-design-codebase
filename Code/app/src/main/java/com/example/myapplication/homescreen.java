package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class homescreen extends AppCompatActivity {

    private ImageView home,you,program,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        home=(ImageView)  findViewById(R.id.selected);
        you=(ImageView) findViewById(R.id.you);
        program=(ImageView) findViewById(R.id.program);
        settings=(ImageView) findViewById(R.id.settings);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, health_status.class));
            }
        });
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, ProfilePage.class));
            }
        });
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, select_program.class));
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, SettingsPage.class));
            }
        });


    }


}