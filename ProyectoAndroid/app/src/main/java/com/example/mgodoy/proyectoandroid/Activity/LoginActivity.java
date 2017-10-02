package com.example.mgodoy.proyectoandroid.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mgodoy.proyectoandroid.Activity.EncuestaClienteActivity;
import com.example.mgodoy.proyectoandroid.R;

public class LoginActivity extends AppCompatActivity{

    private EditText txtusuario;
    private EditText txtPass;
    private Button btnIngresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusuario= (EditText) findViewById(R.id.txtUsuario);
        txtPass=(EditText) findViewById(R.id.txtPassword);
        btnIngresar=(Button) findViewById(R.id.btnIngresar);

    }






    public void IngresoLogin(View view){
        Validar();

    }

public void Validar(){

            String usuario=txtusuario.getText().toString();
            String password=txtPass.getText().toString();

            if(usuario !=null && password.trim().length()>0){
                Intent intent = new Intent(this,EncuestaClienteActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(),"Datos Incorrectos",Toast.LENGTH_SHORT).show();

            }



}
}

