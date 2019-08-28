package com.example.lifecycle29072019;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB", "onCreate");
        btnIntent = findViewById(R.id.btnIntent);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                startActivity(intent);
            }
        });
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
