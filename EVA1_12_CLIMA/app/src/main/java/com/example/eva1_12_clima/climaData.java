package com.example.eva1_12_clima;

public class climaData {
    private int imageID;
    private  String nombreCiudad;
    private double temperatura;
    private String desc;

    public climaData(int imageID,String nombreCiudad, double temperatura, String desc){
        this.imageID = imageID;
        this.nombreCiudad = nombreCiudad;
        this.temperatura = temperatura;
        this.desc = desc;

    }


    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }
}
