package com.example.mgodoy.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mgodoy.ejercicio1.objeto.Alumno;
import com.example.mgodoy.ejercicio1.objeto.Clase;

import java.util.ArrayList;
import java.util.List;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);

        Clase clase  = getIntent().getParcelableExtra("datos");

        Log.i("nombre",clase.getNombre());
        Log.i("nombre",clase.getDescripcion());

        List<Alumno> alumno= clase.getAlumno();

        for(int i=0; i<alumno.size();i++){
            Log.i("nombre",alumno.get(i).getNombre());
            Log.i("apellido",alumno.get(i).getApellido());


        }


    }
}
