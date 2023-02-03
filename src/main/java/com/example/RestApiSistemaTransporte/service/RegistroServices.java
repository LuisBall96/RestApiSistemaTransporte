package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.BusRepository;
import com.example.RestApiSistemaTransporte.repository.DestinoBusRepository;
import com.example.RestApiSistemaTransporte.repository.PasajeroRepository;
import com.example.RestApiSistemaTransporte.repository.RegistroRepository;
import com.example.RestApiSistemaTransporte.repository.model.Bus;
import com.example.RestApiSistemaTransporte.repository.model.DestinoBus;
import com.example.RestApiSistemaTransporte.repository.model.Pasajero;
import com.example.RestApiSistemaTransporte.repository.model.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RegistroServices  implements IRegistro{

    @Autowired
    RegistroRepository registros;
    @Autowired
    BusRepository buses;
    @Autowired
    DestinoBusRepository destinos;
    @Autowired
    PasajeroRepository pasajeros;

    @Override
    public List<Registro> obtenerRegistro() {
        return registros.getRegistro();
    }

    @Override
    public Registro crearRegistro(Registro registro) {
        registros.registrar(registro);
        return registro;
    }

    @Override
    public void añadirParametros(String ID, String id) {

        List<Bus> busasignado = buses.obtenerBuses().stream().filter(bus -> bus.getID().equals(ID)).collect(Collectors.toList());


        List<DestinoBus> destinoSeleccionado = destinos.getDestinos().stream().filter(d -> d.getId().equals(id)).collect(Collectors.toList());


    }
}
