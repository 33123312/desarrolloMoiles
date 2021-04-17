package com.example.eva1_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class climaAdaptador extends ArrayAdapter<climaData> {
    Context context;
    int layout;
    climaData[] ciudades;

    public climaAdaptador(@NonNull Context context, int resource, @NonNull climaData[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout  = resource;
        ciudades = objects;

    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView=((Activity)context).getLayoutInflater().inflate(layout,parent,false);

        ImageView image;
        TextView txtCD,txtTemp,txtDesc;

        image = convertView.findViewById(R.id.imageView);
        txtCD = convertView.findViewById(R.id.textCd);
        txtTemp = convertView.findViewById(R.id.textTemp);
        txtDesc = convertView.findViewById(R.id.txtDesc);

        climaData ciudad = ciudades[position];
        image.setImageResource(ciudad.getImageID());
        txtCD.setText(ciudad.getNombreCiudad());
        txtTemp.setText(ciudad.getTemperatura() + " °C");
        txtDesc.setText(ciudad.getDesc());

        return convertView;
    }
}
