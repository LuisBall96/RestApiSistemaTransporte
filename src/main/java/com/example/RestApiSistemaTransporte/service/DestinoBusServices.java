package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.DestinoBusRepository;
import com.example.RestApiSistemaTransporte.repository.model.DestinoBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DestinoBusServices implements IDestino{

    @Autowired
    private DestinoBusRepository destinoBusRepository;
    @Override
    public List<DestinoBus> obtenerDestinos() {
        return destinoBusRepository.getDestinos();
    }

    @Override
    public DestinoBus agregarDestino(DestinoBus destinoBus) {
        DestinoBus destinoNuevo = new DestinoBus(destinoBus.getId(), destinoBus.getRecorrido());
        destinoBusRepository.agregarDestino(destinoNuevo);
        return destinoNuevo;

    }
}
