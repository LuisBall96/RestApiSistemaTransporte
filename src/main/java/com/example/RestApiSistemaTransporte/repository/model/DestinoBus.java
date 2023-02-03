package com.example.RestApiSistemaTransporte.repository.model;

public class DestinoBus{

    private String id;
    private String recorrido;


    public DestinoBus() {
    }

    public DestinoBus(String id, String recorrido) {
        this.id = id;
        this.recorrido = recorrido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
}
