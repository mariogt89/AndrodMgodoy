package com.example.mgodoy.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mgodoy.ejercicio1.objeto.Alumno;
import com.example.mgodoy.ejercicio1.objeto.Clase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,Datos.class);


        Clase  clase = new Clase();
        clase.setNombre("Curso1");
        clase.setDescripcion("Materia");

        Alumno objetoAlumno = new Alumno("nombre", "apellido");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(objetoAlumno);

        objetoAlumno = new Alumno("nombre2", "apellido2");
        listaAlumnos.add(objetoAlumno);

        intent.putExtra("datos",clase);

    }
}
