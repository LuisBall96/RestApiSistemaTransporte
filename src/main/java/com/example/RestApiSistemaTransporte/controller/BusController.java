package com.example.RestApiSistemaTransporte.controller;


import com.example.RestApiSistemaTransporte.repository.model.Bus;
import com.example.RestApiSistemaTransporte.service.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lineaDeBuses")
public class BusController {

    @Autowired
    IBus lineaBus;

    @GetMapping("/listaBuses")
    public ResponseEntity verBuses(){

        return new ResponseEntity(lineaBus.obtenerBuses() , HttpStatus.FOUND);
    }

    @PostMapping("/crear")
    public ResponseEntity crearBuses(@RequestBody Bus bus) {
        return new ResponseEntity(lineaBus.agregarBus(bus), HttpStatus.CREATED);
    }


}
