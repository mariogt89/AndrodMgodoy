package com.example.mgodoy.proyectoandroid.BasedeDatos;

/**
 * Created by mgodoy on 02/10/2017.
 */

public class Imagenes {

    private String Noformulario;
    private  String idx;
    private String path;

    public Imagenes() {
    }

    public Imagenes(String noformulario, String idx, String path) {
        Noformulario = noformulario;
        this.idx = idx;
        this.path = path;
    }

    public String getNoformulario() {
        return Noformulario;
    }

    public void setNoformulario(String noformulario) {
        Noformulario = noformulario;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
