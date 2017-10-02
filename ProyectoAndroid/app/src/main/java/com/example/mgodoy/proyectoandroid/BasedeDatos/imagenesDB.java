package com.example.mgodoy.proyectoandroid.BasedeDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;

import java.util.ArrayList;

/**
 * Created by mgodoy on 02/10/2017.
 */

public class imagenesDB {

    private SQLiteDatabase bd;
    private ClaseBasedeDatos manejoBD;

    public imagenesDB() {
    }

    public imagenesDB(Context context)
    {
        manejoBD = new ClaseBasedeDatos(context);
    }

    public static ContentValues imagenFormularioContentValues(Imagenes imagen)
    {
        ContentValues cv = new ContentValues();
        cv.put(ClaseBasedeDatos.Numero_Formulario2, imagen.getNoformulario());
        cv.put(ClaseBasedeDatos.idUsuario1, imagen.getIdx());
        cv.put(ClaseBasedeDatos.path, imagen.getPath());
        return  cv;
    }

    public String guardarImagenFormulario(Imagenes imagen)
    {
        bd = manejoBD.getWritableDatabase();
        bd.insert(ClaseBasedeDatos.Tabla_Imagen, null, imagenFormularioContentValues(imagen));
        bd.close();
        return  "CORRECTO";
    }

    public ArrayList<Imagenes> cargarImagenFormulario()
    {
        ArrayList<Imagenes> lImg;
        bd = manejoBD.getReadableDatabase();
        Cursor cImagen = bd.query(ClaseBasedeDatos.Tabla_Imagen, null, null, null, null, null, null);

        lImg = null;
        if(cImagen.moveToFirst())
        {
            do
            {
                lImg = new ArrayList<>();
                Imagenes img = new Imagenes();
                img.setNoformulario(cImagen.getString(0));
                img.setIdx(cImagen.getString(1));
                img.setPath(cImagen.getString(2));
                lImg.add(img);
            }
            while (cImagen.moveToNext());
            cImagen.close();
        }
        bd.close();

        return  lImg;
    }

    public String borrarImagenFormulario(Imagenes imagen)
    {
        bd = manejoBD.getWritableDatabase();
        String WHERE = manejoBD.Numero_Formulario2 + " = ?";
        bd.delete(manejoBD.Tabla_Imagen, WHERE, new String[]{String.valueOf(imagen.getNoformulario())});
        bd.close();

        return  "CORRECTO";
    }

    public String borrarImagenesFormulario()
    {
        bd = manejoBD.getWritableDatabase();
        bd.delete(manejoBD.Tabla_Imagen, null, null);
        bd.close();

        return  "CORRECTO";
    }

    public String actualizarImagenesFormulario(Imagenes imagenes)
    {
        bd = manejoBD.getWritableDatabase();
//        String WHERE = manejoBD.parametro_CodParametro + "= ?";
//        bd.update(manejoBD.Imagen, imagenFormularioContentValues(imagenes), WHERE, new String[]{String.valueOf(imagenes.getNoformulario())});
//        bd.close();

        return  "OK-UPDATE";
    }


}
