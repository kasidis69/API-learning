package com.example.test_api;

import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class CoinDataService {

//    public String getName(){
//        String url ="https://api.coinranking.com/v1/public/coins/Qwsogvtv82FCd";
//
//
//        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
//
//            @Override
//            public void onResponse(JSONArray response) {
//                String name = "";
//
//                try {
//                    JSONObject coinName = response.getJSONObject(1);
//                    name = coinName.getString("uuid");
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//                Toast.makeText(MainActivity.this, "Name ="+ name, Toast.LENGTH_SHORT).show();
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        MySingleton.getInstance(MainActivity.this).addToRequestQueue(request);
//    }
//
//    public List<CoinReportModel> listName(){
//
//    }
//

}
