package com.example.eva1_13_cuadro_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sistema(View view){

        new AlertDialog.Builder(this)
                .setTitle("el titulo")
                .setMessage("el mensaje")
                .setPositiveButton("ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton ok",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("nel",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),"Boton nel",Toast.LENGTH_SHORT).show();
                        }
                    }).setNeutralButton("olvidalo",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Boton olvidadlo",Toast.LENGTH_SHORT).show();
                    }
                }).show()

        ;

    }

    public  void custom(View view){
        Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.custom);

        TextView titulo = dialog.findViewById(R.id.txtTitulo);
        EditText edit = dialog.findViewById(R.id.txtDatos);
        Button btn = dialog.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),edit.getText(),Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}