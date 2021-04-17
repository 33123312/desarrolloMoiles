package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView datos;
    String[] datosArray = {
            "enero",
            "febrero",
            "marzo",
            "mayo",
            "abril",
            "junio",
            "julio",
            "agosto",
            "septiembre",
            "noviembre",
            "diciembre"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
    super.onStart();
    datos = findViewById(R.id.lista);
    datos.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,datosArray));
    MainActivity esta = this;
    datos.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){
                @Override
               public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        Toast.makeText(esta,datosArray[i],Toast.LENGTH_LONG).show();
                    }
            }

    );
    }
}