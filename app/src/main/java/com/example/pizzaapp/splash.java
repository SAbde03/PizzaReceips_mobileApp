package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(splash.this, ListPizzaActivity.class);
                    startActivity(intent);
                    splash.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

    }
}