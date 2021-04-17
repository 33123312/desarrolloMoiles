package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnListener, btnClaseAnonima,btnClase;
    MainActivity esta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener=findViewById(R.id.btnListener);
        btnClaseAnonima =findViewById(R.id.btnClaseAnonima);
        btnClase=findViewById(R.id.btnClase);
        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Evento por clase anónima", Toast.LENGTH_LONG).show();
            }
        });
        esta=this;
        btnClase.setOnClickListener(new MiClaseOnClick(esta));
    }
    public void miClick(View arg){
        Toast.makeText(this, "Evento por XML", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Evento por Listener", Toast.LENGTH_SHORT).show();
    }
}