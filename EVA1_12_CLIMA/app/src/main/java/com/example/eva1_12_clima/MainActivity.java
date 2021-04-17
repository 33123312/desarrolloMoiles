package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    climaData[] climas = new climaData[]{
            new climaData(R.drawable.cloudy,"delicias",12.00,"chido"),
            new climaData(R.drawable.cloudy,"delicias",12.00,"chido"),
            new climaData(R.drawable.cloudy,"delicias",12.00,"chido")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ListView listClima = findViewById(R.id.lista);
        listClima.setAdapter(new  climaAdaptador(this,R.layout.lista_clima,climas));
    }
}