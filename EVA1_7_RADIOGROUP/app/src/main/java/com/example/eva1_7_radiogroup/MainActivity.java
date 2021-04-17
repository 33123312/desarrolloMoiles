package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup rdGrpComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida=findViewById(R.id.rdGrpComida);
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) { //aqui van los toast para saber que onda
            switch (checkedId){
                case R.id.radioButton:
                    Toast.makeText(MainActivity.this, "Café", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton2:
                    Toast.makeText(getApplicationContext(), "Té", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton3:
                    Toast.makeText(MainActivity.this, "Soda", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton4:
                    Toast.makeText(rdGrpComida.getContext(), "awa", Toast.LENGTH_SHORT).show();
                    break;
            }
            }
        });
    }
}