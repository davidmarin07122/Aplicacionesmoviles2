package com.example.aplicacionesmoviles2;

import java.io.Serializable;

public class Actividad implements Serializable {

    String nombreActividad, descripcion;
    int imageActividad;

    public Actividad(String nombreActividad, String descripcion, int imageActividad) {
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.imageActividad = imageActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImageActividad() {
        return imageActividad;
    }

    public void setImageActividad(int imageActividad) {
        this.imageActividad = imageActividad;
    }
}
