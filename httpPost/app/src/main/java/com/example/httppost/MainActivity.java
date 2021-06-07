package com.example.httppost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registrar();
        loguearse();
        consultarRestaurantes();
    }


    public void registrar(){

        FetchData dataConsulter = new FetchData(this);

        JSONObject postData = new JSONObject();
        try {
            postData.put("usuario", "prueba app2");
            postData.put("nombre", "prueba");
            postData.put("apellidos", "app");
            postData.put("numTel", "12343545");
            postData.put("password", "picho");



        } catch (JSONException e) {
            e.printStackTrace();
        }

        Response.Listener<JSONObject>  onResponse = new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                try {
                    if(response.getBoolean("succ") == true)
                        System.out.println("osi,osi");
                    else
                        System.out.println(response.getString("error"));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        dataConsulter.fetch(Request.Method.POST,"register",postData,onResponse);

    }

    public void loguearse(){

        FetchData dataConsulter = new FetchData(this);

        JSONObject postData = new JSONObject();
        try {
            postData.put("usuario", "prueba app2");
            postData.put("password", "picho");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        Response.Listener<JSONObject>  onResponse = new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                try {
                    if (response.has("error"))
                        System.out.println(response.getString("error"));
                    else{
                        System.out.println(response.getString("_id"));
                        System.out.println(response.getString("nombres"));
                        System.out.println(response.getString("apellidos"));
                        System.out.println(response.getString("num_telef"));
                        System.out.println(response.getString("password"));

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        dataConsulter.fetch(Request.Method.POST,"log",postData,onResponse);
    }


    public void reservar(){

        FetchData dataConsulter = new FetchData(this);

        JSONObject postData = new JSONObject();
        try {
            postData.put("restaurante", "prueba app2");
            postData.put("usuario", "picho");
            postData.put("personas", "prueba app2");
            postData.put("adentro", "picho");
            postData.put("fecha", "prueba app2");
            postData.put("hora", "picho");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        Response.Listener<JSONObject>  onResponse = new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response) {
                try {
                    if (response.has("error"))
                        System.out.println(response.getString("error"));
                    else{
                        System.out.println(response.getString("_id"));
                        System.out.println(response.getString("nombres"));
                        System.out.println(response.getString("apellidos"));
                        System.out.println(response.getString("num_telef"));
                        System.out.println(response.getString("password"));

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        dataConsulter.fetch(Request.Method.POST,"log",postData,onResponse);
    }

    public void consultarRestaurantes(){

        FetchData dataConsulter = new FetchData(this);

        Response.Listener<JSONObject>  onResponse = new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject JSONObject) {
                try {
                    JSONArray restaurantes = JSONObject.getJSONArray("restaurantes");
                    for(int i = 0; i < restaurantes.length();i++){
                        String name = restaurantes.getJSONObject(i).getString("nombre");
                        System.out.println(name);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        };
        dataConsulter.fetch(Request.Method.GET,"getRes",null,onResponse);
    }
}