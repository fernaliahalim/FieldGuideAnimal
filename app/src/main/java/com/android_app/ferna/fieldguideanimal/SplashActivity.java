package com.android_app.ferna.fieldguideanimal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Fernalia on 09/05/2016.
 */
public class SplashActivity extends AppCompatActivity {
    Thread timerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.hide();

        timerThread = new Thread(){
            public void run(){
                try{
                    sleep(6000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };

        timerThread.start();
    }

    public void skip(View v){
        timerThread.interrupt();
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onPause(){
        // TODO Auto-generated method sub
        super.onPause();
        finish();
    }
}
