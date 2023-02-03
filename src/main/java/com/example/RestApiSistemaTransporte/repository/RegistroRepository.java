package com.example.RestApiSistemaTransporte.repository;

import com.example.RestApiSistemaTransporte.repository.model.Registro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RegistroRepository {

    private List<Registro> registroList;

    public RegistroRepository() {
        registroList = new ArrayList<>();
    }

    public List<Registro> getRegistro() {
        return registroList;
    }

    public void setRegistro(List<Registro> registros) {
        this.registroList = registros;
    }
    public void registrar(Registro registro) {
        registroList.add(registro);
    }






}
