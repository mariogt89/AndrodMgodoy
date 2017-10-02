package com.example.mgodoy.proyectoandroid.BasedeDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by mgodoy on 27/09/2017.
 */

public class UsuarioDB {


    private SQLiteDatabase db;
    private ClaseBasedeDatos base ;

    public  UsuarioDB (Context context){
        base = new ClaseBasedeDatos(context);


    }

    public  static ContentValues UsuarioContent(Usuario user){
        ContentValues usr =new ContentValues();
        usr.put(ClaseBasedeDatos.Usuario_id,user.getIdusuario());
        usr.put(ClaseBasedeDatos.Usuarionombre,user.getNombre());
        usr.put(ClaseBasedeDatos.Usuario_password ,user.getPassword());

        return usr;
    }

    public String InsertUsuario (Usuario user){

        db=base.getWritableDatabase();
        db.insert(ClaseBasedeDatos.Usuario,null,UsuarioContent(user));

        return (null);
    }


}
