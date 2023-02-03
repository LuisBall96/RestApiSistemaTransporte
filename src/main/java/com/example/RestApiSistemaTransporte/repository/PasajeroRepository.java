package com.example.RestApiSistemaTransporte.repository;

import com.example.RestApiSistemaTransporte.repository.model.Pasajero;
import com.example.RestApiSistemaTransporte.repository.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PasajeroRepository {

    private List <Persona> pasajeros;



    public PasajeroRepository(){
        pasajeros = new ArrayList<>(List.of(new Pasajero("Luis Fernando", 1),
                new Pasajero("Luz", 2),
                new Pasajero("Eduardo", 3),
                new Pasajero("Susana", 4),
                new Pasajero("Lida", 5),
                new Pasajero("Daneris", 6),
                new Pasajero("Wilfran", 7),
                new Pasajero("Nuñez", 8),
                new Pasajero("Luis David", 9),
                new Pasajero("German", 10)
        ));
    }

    public void agregarPasajeros(Pasajero pasajero){
        pasajeros.add(pasajero);
    }

    public List<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
