package com.example.eva3_8_load_image;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Thread hilo;
    Handler handler = new Handler();
    Bitmap a;

    Runnable fore = new Runnable() {
        @Override
        public void run() {
            img.setImageBitmap(a);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        hilo = new Thread(){
            @Override
            public void run() {
                super.run();
                a = decscargar("https://wallpaperaccess.com/full/1078398.jpg");
                handler.post(fore);
            }
        };
        hilo.start();
    }


    private Bitmap decscargar(String url){
        try {
            InputStream i = (InputStream)new URL(url).getContent();
            Bitmap bit = BitmapFactory.decodeStream(i);
            return bit;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}