package com.example.sam.cs_125_final_project;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "FinalProject";
    @SuppressWarnings("CheckStyle")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt_0 = findViewById(R.id.bt_0);
        bt_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 0");
            }
        });
        final Button bt_1 = findViewById(R.id.bt_1);
        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 1");
            }
        });
        final Button bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 2");
            }
        });
        final Button bt_3 = findViewById(R.id.bt_3);
        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 3");
            }
        });
        final Button bt_4 = findViewById(R.id.bt_4);
        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 4");
            }
        });
        final Button bt_5 = findViewById(R.id.bt_5);
        bt_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 5");
            }
        });
        final Button bt_6 = findViewById(R.id.bt_6);
        bt_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 6");
            }
        });
        final Button bt_7 = findViewById(R.id.bt_7);
        bt_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 7");
            }
        });
        final Button bt_8 = findViewById(R.id.bt_8);
        bt_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 8");
            }
        });
        final Button bt_9 = findViewById(R.id.bt_9);
        bt_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for 9");
            }
        });
        final Button bt_pt = findViewById(R.id.bt_pt);
        bt_pt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for calculation");
            }
        });
        
    }
}
