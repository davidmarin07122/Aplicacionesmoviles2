package com.example.aplicacionesmoviles2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask start = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Home.class);
                startActivity(intent);
                finish();
            }
        };

        Timer time = new Timer();
        time.schedule(start,3000);
    }
}