package com.example.mgodoy.proyectoandroid.clases;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mgodoy on 28/09/2017.
 */

public class MostrarUsuario implements Parcelable {

    private String cliente;
    private String Direccion;
    private String Nit;
    private String Telefono;
    private String Correo;
    private String Contacto;
    private  String Imagen;

    public MostrarUsuario(String cliente, String direccion, String nit, String telefono, String correo, String contacto, String imagen) {
        this.cliente = cliente;
        Direccion = direccion;
        Nit = nit;
        Telefono = telefono;
        Correo = correo;
        Contacto = contacto;
        Imagen = imagen;
    }

    public MostrarUsuario() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    protected MostrarUsuario(Parcel in) {
        cliente = in.readString();
        Direccion = in.readString();
        Nit = in.readString();
        Telefono = in.readString();
        Correo = in.readString();
        Contacto = in.readString();
        Imagen = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cliente);
        dest.writeString(Direccion);
        dest.writeString(Nit);
        dest.writeString(Telefono);
        dest.writeString(Correo);
        dest.writeString(Contacto);
        dest.writeString(Imagen);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<MostrarUsuario> CREATOR = new Parcelable.Creator<MostrarUsuario>() {
        @Override
        public MostrarUsuario createFromParcel(Parcel in) {
            return new MostrarUsuario(in);
        }

        @Override
        public MostrarUsuario[] newArray(int size) {
            return new MostrarUsuario[size];
        }
    };
}


