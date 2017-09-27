package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class  Crear extends AppCompatActivity {
    private Spinner marcas, ram, s_ope, colores;
    private EditText precio;
    private Resources resources;
    private String marca[], ra[],s_o[], color[];
    private ArrayAdapter<String>opcMarcas, opcS_o, opcColor, opcRam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
        marcas = (Spinner)findViewById(R.id.cmdMarca);
        ram = (Spinner)findViewById(R.id.cmdRam);
        s_ope  = (Spinner)findViewById(R.id.cmdS_operativo);
        colores = (Spinner)findViewById(R.id.cmdColor);
        precio =(EditText)findViewById(R.id.txtPrecio);
        resources = this.getResources();

        marca = getResources().getStringArray(R.array.marcas);
        ra = getResources().getStringArray(R.array.ram);
        s_o = getResources().getStringArray(R.array.s_ope);
        color = getResources().getStringArray(R.array.color);

        opcMarcas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,marca);
        opcRam = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,ra);
        opcS_o = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,s_o);
        opcColor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,color);

        marcas.setAdapter(opcMarcas);
        ram.setAdapter(opcRam);
        s_ope.setAdapter(opcS_o);
        colores.setAdapter(opcColor);


    }
    public void guardar(View v){
        String ma, ra, so, co;
        double pre;

        ma = marcas.getSelectedItem().toString();
        ra = ram.getSelectedItem().toString();
        so = s_ope.getSelectedItem().toString();
        co = colores.getSelectedItem().toString();
        pre = Double.parseDouble(precio.getText().toString());

        Celular c = new Celular(ma,ra,so,co,pre);
        c.guardar();
        Toast.makeText(this, resources.getString(R.string.msn_exitoso),Toast.LENGTH_SHORT).show();


    }
}
