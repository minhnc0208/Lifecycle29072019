package com.example.lifecycle29072019;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AppCompatActivity {

    Button btnIntent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        Log.d("BBB", "onCreate2");

        btnIntent2 = findViewById(R.id.buttonIntent2);

        btnIntent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        Screen2.this,
                        Screen3.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "onStop2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "onRestart2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "onDestroy2");
    }
}
