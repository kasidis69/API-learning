package com.example.test_api;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button btn_getName, getdescription, getImageURL;
    EditText et_dataInput;
    ListView lv_coinlist;


    // Get Request For JSONObject
    // Get Request For JSONObject

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values to each control on the layout
        btn_getName = findViewById(R.id.btn_getName);
        getdescription = findViewById(R.id.getdescription);
        getImageURL = findViewById(R.id.getImageURL);

        et_dataInput = findViewById(R.id.et_dataInput);
        lv_coinlist = findViewById(R.id.lv_coinlist);


//                                           @Override
//                                           public void onClick(View v) {
//                                               String url = "https://api.coinranking.com/v2/coins/";
//
//
//                                               final ProgressDialog loading = new ProgressDialog(MainActivity.this);
//                                               loading.setMessage("Please Wait...");
//                                               loading.setCanceledOnTouchOutside(false);
//                                               loading.show();
//
//                                               JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//                                                   @Override
//                                                   public void onResponse(JSONObject response) {
//                                                       Log.d("Response", response.toString());
//
//                                                       try {
//                                                           Log.d("JSON", String.valueOf(response));
//                                                           loading.dismiss();
//                                                           String Error = response.getString("Error");
//                                                           if (Error.equals("OK")) {
//                                                               JSONObject Body = response.getJSONObject("coins");
//                                                               JSONObject asset = Body.getJSONObject("description");
//
//
//                                                           }
//                                                       } catch (JSONException e) {
//                                                           e.printStackTrace();
//                                                           loading.dismiss();
//
//                                                       }
//
//                                                   }
//                                               }, new Response.ErrorListener() {
//                                                   @Override
//                                                   public void onErrorResponse(VolleyError error) {
//                                                       loading.dismiss();
//                                                       VolleyLog.d("Error", "Error: " + error.getMessage());
//                                                       Toast.makeText(MainActivity.this, "" + error.getMessage(), Toast.LENGTH_SHORT).show();
//
//                                                   }
//                                               }) {
//                                                   @Override
//                                                   public String getBodyContentType() {
//                                                       return "application/json; charset=utf-8";
//                                                   }
//
//
//                                               };
//                                               RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
//                                               queue.add(req);
//                                           }
//
//
//
//
//});
//    }}


                                           //click list
//        btn_getName.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {

                                           // Instantiate the RequestQueue.
//                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
//        String url = "https://api.coinranking.com/v1/public/coins/";
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
//                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        TextView textView = new TextView(MainActivity.this);
//                        textView.setText("Response: " + response.toString());
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
//                    }
//
//
//                });
//        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
//
//        @Override
//        protected Response<T> parseNetworkResponse(
//                NetworkResponse response) {
//            try {
//                String json = new String(response.data,
//                        HttpHeaderParser.parseCharset(response.headers));
//                return Response.success(gson.fromJson(json, clazz),
//                        HttpHeaderParser.parseCacheHeaders(response));
//            }

// Add the request to the RequestQueue.
//                queue.add(stringRequest);


                                           // Instantiate the RequestQueue.
                                           RequestQueue queue = Volley.newRequestQueue(MainActivity.this);


//                                            Request a string response from the provided URL.
                                           String url = "https://api.coinranking.com/v1/public/coin/1";
                                           StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                                                   new Response.Listener<String>() {
                                                       @Override
                                                       public void onResponse(String response) {
                                                           Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                                                       }
                                                   }, new Response.ErrorListener() {
                                               @Override
                                               public void onErrorResponse(VolleyError error) {
                                                   Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                                               }
                                           });
        queue.add(stringRequest);
                                       }
    }



// Add the request to the RequestQueue.


                //Toast.makeText(MainActivity.this, "Yot click me", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        getdescription.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        getImageURL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this, "Yot typed" + et_dataInput.getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });




