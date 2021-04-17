package com.example.eva1_10_orientacion;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        v = findViewById(R.id.txtVwMensaje);
        v.setText("el mismo widget");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Ondestroy",Toast.LENGTH_LONG);
    }
}