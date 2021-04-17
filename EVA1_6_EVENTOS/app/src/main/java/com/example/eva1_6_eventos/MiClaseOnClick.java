package com.example.eva1_6_eventos;

import android.view.View;
import android.widget.Toast;

public class MiClaseOnClick implements View.OnClickListener {
    MainActivity esta;
    @Override
    public void onClick(View v) {
        Toast.makeText(esta, "Por clase propia", Toast.LENGTH_SHORT).show();
    }
    public MiClaseOnClick(MainActivity esta){
        this.esta=esta;
    }
}