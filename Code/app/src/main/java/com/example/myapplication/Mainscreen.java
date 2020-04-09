package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainscreen extends AppCompatActivity {
    Button starts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        final Button tempbutton= (Button) findViewById(R.id.tempbutton);

        tempbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Mainscreen.this, ProfilePage.class));
            }
        });

        final Button tempbutton2= (Button) findViewById(R.id.tempbutton2);
        tempbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Mainscreen.this, SettingsPage.class));
            }
        });

    }

}
