package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by Android on 26/09/2017.
 */

public class Datos {
    private static ArrayList<Celular> celulares= new ArrayList<>();
    public static void guardar(Celular p){
        celulares.add(p);
    }
    public static ArrayList<Celular> obtener(){
        return celulares;
    }
}
