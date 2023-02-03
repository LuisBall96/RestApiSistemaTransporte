package com.example.RestApiSistemaTransporte.service;

import com.example.RestApiSistemaTransporte.repository.model.Registro;

import java.util.List;

public interface IRegistro {
    List<Registro> obtenerRegistro();
    Registro crearRegistro (Registro registro);

    void añadirParametros(String ID , String id);
}
