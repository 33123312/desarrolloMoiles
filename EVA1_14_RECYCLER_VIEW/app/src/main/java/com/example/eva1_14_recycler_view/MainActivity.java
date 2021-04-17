package com.example.eva1_14_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView lista;
    String[] cosas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.list);
        llenarArreglo();
        lista.setAdapter(new adaptador(cosas));
        lista.setLayoutManager(new LinearLayoutManager(this));
    }

    private void llenarArreglo(){
        cosas = new String[100];
        for (int i = 0;i  < cosas.length;i++)
            cosas[i] = "Elemento " + i;
    }
}