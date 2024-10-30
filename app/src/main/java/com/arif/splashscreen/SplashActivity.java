package com.arif.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    // Duration for the splash screen (in milliseconds)
    private static final int SPLASH_SCREEN_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler to delay the transition to the main activity
        new Handler().postDelayed(() -> {
            // Start the main activity
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Finish the splash activity so the user cannot return to it
        }, SPLASH_SCREEN_DURATION); // Set the duration here
    }
}