package com.example.RestApiSistemaTransporte.controller;

import com.example.RestApiSistemaTransporte.repository.model.DestinoBus;
import com.example.RestApiSistemaTransporte.service.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("destinoBus")
public class DestinoBusController {

    @Autowired
    IDestino destino;


    @GetMapping("/listaDestino")
    public ResponseEntity getDestinos(){

        return new ResponseEntity(destino.obtenerDestinos() , HttpStatus.FOUND);
    }
    @PostMapping("/crear")
    public ResponseEntity crear(@RequestBody DestinoBus destinoBus) {
        return new ResponseEntity(destino.agregarDestino(destinoBus), HttpStatus.CREATED);
    }
}
