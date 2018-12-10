package com.example.sam.cs_125_final_project;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "FinalProject";

    /** Request queue for our network requests. */
    private static RequestQueue requestQueue;
    private static String code = "CNY";
    private static double rates = 0;
    @SuppressWarnings("CheckStyle")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set up a queue for our Volley requests
        requestQueue = Volley.newRequestQueue(this);

        setContentView(R.layout.activity_main);
        final TextView output = (TextView) findViewById(R.id.output);
        final EditText input = findViewById(R.id.input);

        final Button bt_1 = findViewById(R.id.bt_1);
        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for HKD");
                code = "HKD";
                startAPICall(code);
                if (input.getText() == null) {
                    Log.d(TAG,"NUll");
                }
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for KRW");
                code = "KRW";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_3 = findViewById(R.id.bt_3);
        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for RUB");
                code = "RUB";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));

            }
        });
        final Button bt_4 = findViewById(R.id.bt_4);
        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for JPY");
                code = "JPY";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_5 = findViewById(R.id.bt_5);
        bt_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for CAD");
                code = "CAD";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_6 = findViewById(R.id.bt_6);
        bt_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for NZD");
                code = "NZD";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_7 = findViewById(R.id.bt_7);
        bt_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for CNY");
                code = "CNY";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_8 = findViewById(R.id.bt_8);
        bt_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for EUR");
                code = "EUR";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });
        final Button bt_9 = findViewById(R.id.bt_9);
        bt_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG,"button for GBP");
                code = "GBP";
                startAPICall(code);
                double num = Double.parseDouble(input.getText().toString());
                output.setText(String.valueOf(rates * num));
            }
        });

        
    }
    void startAPICall(final String str) {
        try {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    "https://api.exchangeratesapi.io/latest?base=USD",
                    null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(final JSONObject response) {
                            Log.d(TAG, response.toString());
                            try {
                                JSONObject rate = response.getJSONObject("rates");
                                Log.d(TAG, rate.get(str).toString());
                                rates = Double.parseDouble(rate.get(str).toString());
                                Log.d(TAG,String.valueOf(rates));
                            } catch (JSONException e) {
                                Log.e(TAG, "i dont know what happened");
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(final VolleyError error) {
                    Log.w(TAG, error.toString());
                }
            });
           requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

