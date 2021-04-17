package com.example.eva1_14_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolder> {

    private String[] datos;
    public adaptador(String[] datos){
        this.datos = datos;
    }


    public  static  class ViewHolder extends RecyclerView.ViewHolder{
        TextView pView;
        public ViewHolder(View view){
            super(view);
            pView = view.findViewById(R.id.list);
        }
        public TextView getpView(){
            return pView;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.otro_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getpView().setText(datos[position]);
    }


    @Override
    public int getItemCount() {
        return datos.length;
    }
}
