package com.example.RestApiSistemaTransporte.controller;

import com.example.RestApiSistemaTransporte.repository.model.Registro;
import com.example.RestApiSistemaTransporte.service.IRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registros")
public class RegistroController {

    @Autowired
    IRegistro registro;

    @GetMapping("/Registros")
    public ResponseEntity verRegistro(){

        return new ResponseEntity(registro.obtenerRegistro() , HttpStatus.FOUND);
    }

    @PostMapping("/{ID}/{id}")
    public ResponseEntity crearRegistro(@PathVariable("ID")String ID,@PathVariable("ID") String id) {
        registro.añadirParametros(ID,id);
        return new ResponseEntity(registro.obtenerRegistro(), HttpStatus.CREATED);
    }



}
