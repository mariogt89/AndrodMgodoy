package com.example.mgodoy.ejercicio1.objeto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mgodoy on 06/09/2017.
 */

//public class Alumno {

  //  public String nombre;
   // public  String apellido;

//}
public class Alumno implements Parcelable {

    public String nombre;
    public  String apellido;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    protected Alumno(Parcel in) {
        nombre = in.readString();
        apellido = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(apellido);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Alumno> CREATOR = new Parcelable.Creator<Alumno>() {
        @Override
        public Alumno createFromParcel(Parcel in) {
            return new Alumno(in);
        }

        @Override
        public Alumno[] newArray(int size) {
            return new Alumno[size];
        }


    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}


