package com.example.RestApiSistemaTransporte.repository.model;

import java.util.List;

public class Registro {

    private String id;
    private String date;
    private Bus bus;
    private DestinoBus destinoBus;
    private List<Pasajero> pasajeros;


    public Registro() {
    }

    public Registro(String id, String date, Bus bus, DestinoBus destinoBus, List<Pasajero> pasajeros) {
        this.id = id;
        this.date = date;
        this.bus = bus;
        this.destinoBus = destinoBus;
        this.pasajeros = pasajeros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public DestinoBus getDestinoBus() {
        return destinoBus;
    }

    public void setDestinoBus(DestinoBus destinoBus) {
        this.destinoBus = destinoBus;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
