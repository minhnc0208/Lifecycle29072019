package com.example.lifecycle29072019;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart");
    }

    @Override
    protected void onPause() {
        Log.d("BBB", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("BBB", "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("BBB", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB", "onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB", "onDestroy");
        super.onDestroy();
    }
}
