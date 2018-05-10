package com.example.designmodal.jobchaiyo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.designmodal.jobchaiyo.Activities.Navigation_Main;

public class Splash_Activity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent = new Intent(Splash_Activity.this,Navigation_Main.class);
                startActivity(intent);
                finish();


            }
        },SPLASH_TIME_OUT);
    }
}
