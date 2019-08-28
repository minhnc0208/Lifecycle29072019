package com.example.lifecycle29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart 2 ");
    }

    @Override
    protected void onPause() {
        Log.d("BBB", "onPause 2 ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("BBB", "onStop 2 ");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("BBB", "onRestart 2 ");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB", "onResume 2 ");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB", "onDestroy 2 ");
        super.onDestroy();
    }

}
