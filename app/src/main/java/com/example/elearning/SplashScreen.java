package com.example.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView sptx1 ,sptx2;
    private static int Splash_timeout = 50000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        sptx1 = findViewById(R.id.splashText1);
        sptx2 = findViewById(R.id.splashText2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashScreen.this , MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        },Splash_timeout);
        Animation myanimation1 = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.animation2);
        sptx1.setAnimation(myanimation1);
        Animation myanimation2 = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.animation1);
        sptx2.setAnimation(myanimation2);
    }
}