package com.inpows.circularprogressview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircularProgressView progressView = (CircularProgressView) findViewById(R.id.circular_progress1);
        progressView.startAnimation();
    }
}
