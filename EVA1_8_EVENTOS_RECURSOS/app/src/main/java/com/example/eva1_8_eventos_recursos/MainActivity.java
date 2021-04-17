package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    TextView apellidoLabel,nombreLabel;
    EditText nombreText, apellidoText;
    RadioGroup lenguageSelectorM;
    RadioButton radioEng,radioES;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apellidoLabel = findViewById(R.id.apellidoLabel);
        nombreLabel = findViewById(R.id.nombreLabel);
        nombreText = findViewById(R.id.nombreText);
        apellidoText = findViewById(R.id.apellidoText);
        lenguageSelectorM = findViewById(R.id.buttonGroup);
        radioEng =findViewById(R.id.inglesRadio);
        radioES = findViewById(R.id.españolRadio);
        lenguageSelectorM.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.españolRadio){
                    nombreText.setText(R.string.txt_vw_nom);
                    apellidoText.setHint(R.string.txt_vw_ape);
                    nombreLabel.setText(R.string.edt_txt_nom);
                    apellidoLabel.setHint(R.string.edt_txt_ape);
                    radioES.setText(R.string.rd_btn_es);
                    radioEng.setText(R.string.rd_btn_in);


                } else{
                    nombreText.setText(R.string.txt_vw_nom_en);
                    apellidoText.setHint(R.string.txt_vw_ape_en);
                    nombreLabel.setText(R.string.edt_txt_nom_en);
                    apellidoLabel.setHint(R.string.edt_txt_ape_en);
                    radioES.setText(R.string.rd_btn_es_en);
                    radioEng.setText(R.string.rd_btn_in_en);

                }


            }
        });
    }
}