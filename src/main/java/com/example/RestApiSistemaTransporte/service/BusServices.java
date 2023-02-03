package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.BusRepository;
import com.example.RestApiSistemaTransporte.repository.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BusServices implements IBus{


    @Autowired
    BusRepository lineaBus;


    @Override
    public List<Bus> obtenerBuses() {
        return lineaBus.obtenerBuses();
    }

    @Override
    public Bus agregarBus(Bus bus) {
        Bus busNuevo = new Bus(bus.getCantidadPuestos(), bus.getID(), bus.getNombreBus());
        lineaBus.agregarNuevoBus(busNuevo);
        return busNuevo;
    }
}
