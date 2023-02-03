package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.model.DestinoBus;

import java.util.List;

public interface IDestino {
    List<DestinoBus> obtenerDestinos();
    DestinoBus agregarDestino(DestinoBus destinoBus);

}
