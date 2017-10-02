package com.example.mgodoy.proyectoandroid.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mgodoy.proyectoandroid.Activity.LoginActivity;
import com.example.mgodoy.proyectoandroid.R;

public class MainActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(receiveRunnable, 3_000);

    }


    private Runnable receiveRunnable = new Runnable() {
        @Override
        public void run() {
            IniciarLogin();
        }
    };

    public void IniciarLogin(){
      Intent intent = new Intent(this,LoginActivity.class);

        startActivity(intent);
    }


}
