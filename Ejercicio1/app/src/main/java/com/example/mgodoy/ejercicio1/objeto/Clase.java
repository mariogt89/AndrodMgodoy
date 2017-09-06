package com.example.mgodoy.ejercicio1.objeto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgodoy on 06/09/2017.
 */

//public class Clase {

    //public String nombre;
   // public String descripcion;
   // public String alumno;
//}
public class Clase implements Parcelable {

    public String nombre;
    public String descripcion;
    public List<Alumno> alumno;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<Alumno> alumno) {
        this.alumno = alumno;
    }

    public Clase (){
        alumno = new ArrayList<>();
    }
    protected Clase(Parcel in) {
        nombre = in.readString();
        descripcion = in.readString();
        if (in.readByte() == 0x01) {
            alumno = new ArrayList<Alumno>();
            in.readList(alumno, Alumno.class.getClassLoader());
        } else {
            alumno = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(descripcion);
        if (alumno == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(alumno);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Clase> CREATOR = new Parcelable.Creator<Clase>() {
        @Override
        public Clase createFromParcel(Parcel in) {
            return new Clase(in);
        }

        @Override
        public Clase[] newArray(int size) {
            return new Clase[size];
        }
    };


    public void setAlumno(String s) {

    }
}