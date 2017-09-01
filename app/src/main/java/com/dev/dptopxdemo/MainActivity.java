package com.dev.dptopxdemo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int  dpValue;
    public  double PX_DP_RATIO = 0.4793608521970706;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Pixel to dp convertion for nexus five which is my own ration */
        new CountDownTimer(10000, 10) {
            @Override
            public void onTick(long l) {
                Log.d("MainActivity", count + "PX = "+PX_DP_RATIO* count+" DP");
                count++;

            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
