package com.example.RestApiSistemaTransporte.repository.model;

import java.util.Date;

public class Bus extends SistemaTransporte {

    private String ID;

    private String nombreBus;

    public Bus(int cantidadPuestos) {
        super(cantidadPuestos);
    }

    @Override
    public void ocuparPuestos() {
        this.cantidadPuestos--;
    }

    public Bus(int cantidadPuestos, String ID, String nombreBus) {
        super(cantidadPuestos);
        this.ID = ID;
        this.nombreBus = nombreBus;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }


}