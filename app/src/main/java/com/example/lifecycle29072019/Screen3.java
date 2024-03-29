package com.example.lifecycle29072019;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Screen3 extends AppCompatActivity {

    Button btnIntent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Log.d("BBB", "onCreate3");
        btnIntent3 = findViewById(R.id.buttonIntent3);
        btnIntent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        Screen3.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "onResume3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "onPause3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "onStop3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "onRestart3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "onDestroy3");
    }
}