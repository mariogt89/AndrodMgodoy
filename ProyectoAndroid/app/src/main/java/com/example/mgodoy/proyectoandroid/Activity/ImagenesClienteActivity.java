package com.example.mgodoy.proyectoandroid.Activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.location.Location;
import android.location.LocationListener;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.clases.MostraImagen;
import com.example.mgodoy.proyectoandroid.clases.MostrarUsuario;
import com.example.mgodoy.proyectoandroid.holder.HolderImagen;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ImagenesClienteActivity extends AppCompatActivity {
    private static final int CAPTURA_DE_IMAGENES = 1;
    private static final byte TAKE_PICTURE = 1;
    private static final int SELECT_PICTURE = 1;
    private MostrarUsuario mostrarUsuario;
    private int conteo;
    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //abrirCamara();

                FloatingActionButton rbtnFull = (FloatingActionButton)findViewById(R.id.fab);
                FloatingActionButton rbtnGallery = (FloatingActionButton) findViewById(R.id.fab);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);


            }
        });

    }
    public void abrirCamara() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(getTemporal(this)));
            startActivityForResult(takePictureIntent, CAPTURA_DE_IMAGENES);
        }
    }
    private File getTemporal(Context context) {
        final File path = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        if (!path.exists()) {
            path.mkdir();
        }
        return new File(path, "image" + mostrarUsuario.getNit() + conteo + ".tmp");
    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == TAKE_PICTURE) {
//        } else if (requestCode == SELECT_PICTURE){
//        }
//        ImageView iv = (ImageView)findViewById(R.id.rvImagen);
//        iv.setImageBitmap(BitmapFactory.decodeFile());
//    }
//}

}