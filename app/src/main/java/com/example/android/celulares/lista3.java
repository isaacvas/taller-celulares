package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class lista3 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista3);

        resources = this.getResources();

        tabla = (TableLayout)findViewById(R.id.tabla3);
        celulares = Datos.obtener();

        for (int i = 0; i < celulares.size() ; i++) {
            if (celulares.get(i).getMarca().equals(resources.getString(R.string.samsung)) && (Integer.parseInt(celulares.get(i).getRam()) >= 2 && Integer.parseInt(celulares.get(i).getRam()) <= 4)) {
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);

                c1.setText("" + celulares.get(i).getMarca());
                c2.setText("" + celulares.get(i).getRam());
                c3.setText("" + celulares.get(i).getS_operativo());
                c4.setText("" + celulares.get(i).getColor());
                c5.setText("" + celulares.get(i).getPrecio());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);

                tabla.addView(fila);
            }
        }
    }
}
