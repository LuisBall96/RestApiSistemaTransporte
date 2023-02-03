package com.example.RestApiSistemaTransporte.repository.model;

import java.util.Date;
import java.util.List;


public abstract class SistemaTransporte {

    protected int cantidadPuestos;

    public SistemaTransporte(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

    public abstract void ocuparPuestos();
}


