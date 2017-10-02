package com.example.mgodoy.proyectoandroid.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.clases.MostrarUsuario;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class IngresoClienteScrollingActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private TextView txtMostrar;
    private TextView txtMostrar1;
    private TextView txtMostrar2;
    private TextView txtMostrar3;
    private EditText txtCliente;
    private EditText txtDireccion;
    private EditText txtNit;
    private EditText txtTelefono;
    private TextView txtCorreo;
    private TextView txtContacto;

    private MostrarUsuario mostrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_cliente_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mostrarUsuario=getIntent().getParcelableExtra("datosUsuario");

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fab2=(FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readText();

            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CambiarPantalla(null);
            }
        });


        intcomponente();
    }

    private void intcomponente() {
        txtMostrar = (TextView) findViewById(R.id.tv_resultado);
        txtMostrar1=(TextView) findViewById(R.id.tv_resultado1);
        txtMostrar2=(TextView) findViewById(R.id.tv_resultado2);
        txtMostrar3=(TextView) findViewById(R.id.tv_resultado3);
        txtCliente = (EditText) findViewById(R.id.txtcliente);
        txtDireccion = (EditText) findViewById(R.id.txtDireccion);
        txtNit = (EditText) findViewById(R.id.txtNit);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        txtCorreo = (EditText) findViewById(R.id.txtcorreo);
        txtContacto = (EditText) findViewById(R.id.txtcontatcto);

        if (mostrarUsuario!=null){
            txtCliente.setText(mostrarUsuario.getCliente());
            txtDireccion.setText(mostrarUsuario.getDireccion());
            txtTelefono.setText(mostrarUsuario.getTelefono());
            txtNit.setText(mostrarUsuario.getNit());
            txtContacto.setText(mostrarUsuario.getContacto());
            txtCorreo.setText(mostrarUsuario.getCorreo());




        }

    }



    public void readText() {
        String text = txtCliente.getText().toString();
        String text1= txtDireccion.getText().toString();
        String text2= txtNit.getText().toString();
        String text3= txtTelefono.getText().toString();


        if ((text != null) && (!text.trim().isEmpty())) {
            txtMostrar.setText(text);
        } if ((text1 != null) && (!text1.trim().isEmpty())) {
            txtMostrar1.setText(text1);
        }if ((text2 != null) && (!text2.trim().isEmpty())) {
            txtMostrar2.setText(text2);
        }if ((text3 != null) && (!text3.trim().isEmpty())) {
            txtMostrar3.setText(text3);
        } else {
            txtMostrar.setText("");
            Toast.makeText(this, "No Ingreso Datos", Toast.LENGTH_LONG).show();
        }
            }


        @Override
        public void onMapReady (GoogleMap googleMap){
            mMap = googleMap;

            // Add a marker in Sydney and move the camera
            LatLng sydney = new LatLng(-34, 151);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }


    public void CambiarPantalla(MostrarUsuario mostrarUsuario) {
        Intent intent = new Intent(IngresoClienteScrollingActivity.this, ImagenesClienteActivity.class);
        startActivity(intent);
    }

        @Override
        public void onPointerCaptureChanged ( boolean hasCapture){

        }
    }

