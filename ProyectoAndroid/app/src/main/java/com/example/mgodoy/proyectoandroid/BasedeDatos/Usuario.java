package com.example.mgodoy.proyectoandroid.BasedeDatos;

/**
 * Created by mgodoy on 27/09/2017.
 */

public class Usuario {


    private String Idusuario;
    private String Nombre;
    private String Password;


    public String getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(String idusuario) {
        Idusuario = idusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Usuario(String idusuario, String nombre, String password) {
        Idusuario = idusuario;
        Nombre = nombre;
        Password = password;
    }

    public Usuario() {
    }
}
