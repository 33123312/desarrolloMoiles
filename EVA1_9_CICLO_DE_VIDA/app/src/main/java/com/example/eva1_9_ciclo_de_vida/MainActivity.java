package com.example.eva1_9_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate",Toast.LENGTH_LONG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_LONG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_LONG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_LONG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG);
    }
}
