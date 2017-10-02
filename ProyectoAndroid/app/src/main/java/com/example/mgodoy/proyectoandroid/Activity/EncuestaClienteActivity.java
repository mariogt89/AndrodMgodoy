package com.example.mgodoy.proyectoandroid.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.adapter.AdapterMostraCliente;
import com.example.mgodoy.proyectoandroid.clases.MostrarUsuario;

import java.util.ArrayList;
import java.util.List;

public class EncuestaClienteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMostraCliente adapterMostraCliente;
    private Context context;
    private List<MostrarUsuario> mostrarUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarPantalla(null);
        }
        });


        context=this;
        recyclerView= findViewById(R.id.MostraClienteRecyClerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        mostrarUsuarios = new ArrayList<>();

        mostrarUsuarios.add(new MostrarUsuario("Mario Godoy", "Zona 10 Colonia 1","1234567","45785254","mg@gmail.com","mario","imagen1"));
        mostrarUsuarios.add(new MostrarUsuario("Alexaner", "Zona 9 Colonia 8","5896748","45785254","alex@gmail.com","antonio","imagen2"));
        mostrarUsuarios.add(new MostrarUsuario("Luis", "Zona 5 Colonia 8","65746574","56785254","luis@gmail.com","juan","imagen3"));
        mostrarUsuarios.add(new MostrarUsuario("Antonio", "Zona 8 Colonia 14","78958695","45778554","ant@gmail.com","Luis","imagen4"));

        adapterMostraCliente=new AdapterMostraCliente(context,mostrarUsuarios);
        recyclerView.setAdapter(adapterMostraCliente);



    }

    public void CambiarPantalla(MostrarUsuario mostrarUsuario){
        Intent intent = new Intent(EncuestaClienteActivity.this,IngresoClienteScrollingActivity.class);
        intent.putExtra("datosUsuario",mostrarUsuario);
        startActivity(intent);
    }


}
