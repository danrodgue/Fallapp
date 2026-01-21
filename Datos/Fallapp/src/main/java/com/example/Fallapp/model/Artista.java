package com.example.Fallapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("artistas")
public class Artista {

    @Id
    private String id;
    private String nombre;
    private String especialidad;
    private String nacionalidad;
    private String descripcion;

    public Artista() {
    }

    public Artista(String nombre, String especialidad, String nacionalidad, String descripcion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.nacionalidad = nacionalidad;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

