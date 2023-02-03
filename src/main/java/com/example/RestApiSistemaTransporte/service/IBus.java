package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.model.Bus;

import java.util.List;

public interface IBus {

    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);
}
