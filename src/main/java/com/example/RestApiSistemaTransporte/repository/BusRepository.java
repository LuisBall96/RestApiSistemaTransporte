package com.example.RestApiSistemaTransporte.repository;

import com.example.RestApiSistemaTransporte.repository.model.Bus;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {

    private List<Bus> lineaBuses;

    public BusRepository(){

        lineaBuses = new ArrayList<>(List.of(new Bus(25, "1", "Trasalianco"),
                new Bus(12, "2", "Trasalfa"),
                new Bus(43, "3", "Alianza Sodis"),
                new Bus(12, "4", "Transmecar"),
                new Bus(22, "5", "Coolitoral")
                ));
    }

    public void agregarNuevoBus(Bus bus){
        lineaBuses.add(bus);
    }

    public List<Bus> obtenerBuses(){
        return this.lineaBuses;
    }






}
