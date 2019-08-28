package com.example.lifecycle29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart 3 ");
    }

    @Override
    protected void onPause() {
        Log.d("BBB", "onPause 3 ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("BBB", "onStop 3 ");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("BBB", "onRestart 3 ");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB", "onResume 3 ");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB", "onDestroy 3 ");
        super.onDestroy();
    }
}
