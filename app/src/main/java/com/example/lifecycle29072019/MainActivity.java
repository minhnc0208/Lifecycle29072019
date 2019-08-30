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

        btnIntent = findViewById(R.id.buttonIntent);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "onDestroy");
    }
}
