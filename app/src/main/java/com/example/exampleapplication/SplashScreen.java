package com.example.exampleapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

class SplashScren extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(com.example.exampleapplication.SplashScren.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
