package com.example.android.celulares;

/**
 * Created by Android on 26/09/2017.
 */

public class Celular {
    private String marca;
    private String ram;
    private String s_operativo;
    private String color;
    private double precio;

    public Celular(String marca, String ram, String s_operativo, String color, double precio) {
        this.marca = marca;
        this.ram = ram;
        this.s_operativo = s_operativo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getRam() {
        return ram;
    }

    public String getS_operativo() {
        return s_operativo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setS_operativo(String s_operativo) {
        this.s_operativo = s_operativo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}
