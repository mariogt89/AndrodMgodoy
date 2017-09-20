package com.example.mgodoy.layout;

/**
 * Created by mgodoy on 19/09/2017.
 */

public class imagen {
    private int imagen;
    private String nombre;

    public imagen(int imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public imagen () {

    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
