package com.nineinfosys.android.marathikavita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.nineinfosys.android.marathikavita.Home.Home;

public class MainActivity extends Activity {
    private static int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {



            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);

                // close this activity
                finish();
            }

        }, SPLASH_TIME_OUT);



    }
}
