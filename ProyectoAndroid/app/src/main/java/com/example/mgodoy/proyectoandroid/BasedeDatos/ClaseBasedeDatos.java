package com.example.mgodoy.proyectoandroid.BasedeDatos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.w3c.dom.Text;

/**
 * Created by mgodoy on 27/09/2017.
 */

public class ClaseBasedeDatos extends SQLiteOpenHelper {
    public ClaseBasedeDatos(Context context) {
        super(context,basedatosNombre,null,versionBD);


    }

    private SQLiteDatabase mdb;
    public static final   String basedatosNombre="";
    public static final   int versionBD=1;

    private static final String Text_Type="TEXT";
    private static  final String int_TYPE="int";
    private static final String Coma=",";

    public static final String Tabla_Usuario="Usuario";
    public static final String Usuario_id="idUsuario";
    public static final String Usuarionombre="Nombre";
    public static final String Usuario_password="password";

    public static final String Usuario="Create Table"+ Tabla_Usuario+"("+ Usuario_id+ Text_Type+Coma
            + Usuarionombre+Text_Type+Coma+Usuario_password+Text_Type+")";

    public  static  final   String Tabla_Cabecera="Cabecera";
    public static  final String Numero_Formulario="NoFormulario";
    public static  final String idUsuario1="idusuario";
    public static  final String fecha="NoFormulario";
    public static  final String cordenadasX ="cordenedasX";
    public static  final String cordenadasY ="cordenedasY";

    public static final String Cabecera="Create Table"+ Tabla_Cabecera+"("+ Numero_Formulario+ Text_Type+Coma
            + idUsuario1+Text_Type+Coma+fecha+Text_Type+Coma+cordenadasX+ Text_Type+cordenadasY+ Text_Type+")";

    public static final String Tabla_Detalle="Detalle";
    public static final String Numero_Formulario1="Noformulario";
    public static final String Numero_pregunta="Pregunta";
    public static final String Respuesta="Respuesta";

    public static final String Detalle="Create Table"+ Tabla_Detalle+"("+ Numero_Formulario1+ Text_Type+Coma
            + Numero_pregunta+Text_Type+Coma+Respuesta+Text_Type+")";


    public static final String Tabla_Imagen="Imagen";
    public static final String Numero_Formulario2="Noformulario";
    public static final String idx="idx";
    public static final String path="path";

    public static final String Imagen="Create Table"+ Tabla_Imagen+"("+ Numero_Formulario2+ Text_Type+Coma
            + idx+Text_Type+Coma+path+Text_Type+")";


    public static final String Tabla_Parametro="Imagen";
    public static final String Codigo="Codigo";
    public static final String Nombre="Nombre";
    public static final String Valor="path";

    public static final String Parametro="Create Table"+ Tabla_Parametro+"("+ Codigo+ Text_Type+Coma
            + Nombre+Text_Type+Coma+Valor+Text_Type+")";


    public static final String Tabla_Correlativo="Imagen";
    public static final String Tipo_Formulario="Codigo";
    public static final String Numero="Nombre";


    public static final String Correlativo="Create Table"+ Tabla_Correlativo+"("+ Tipo_Formulario+ Text_Type+Coma
            + Numero+Text_Type+")";

    public void openReadableDB(){
        mdb=this.getReadableDatabase();
    }

    public void openWriteableDB(){
        mdb=this.getWritableDatabase();
    }

    public void closeDB(){
        if(mdb!=null)
        {
            mdb.close();
        }
    }

    @Override
    public void onOpen(SQLiteDatabase db){
        super.onOpen(db);
        if(!db.isReadOnly())
        {
            db.execSQL("PRAGMA foreing_keys=on;");
        }
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Usuario);
        sqLiteDatabase.execSQL(Imagen);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
