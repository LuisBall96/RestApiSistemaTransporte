package com.example.RestApiSistemaTransporte.repository;

import com.example.RestApiSistemaTransporte.repository.model.DestinoBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DestinoBusRepository {


    private List<DestinoBus> destinoBusList;


    public DestinoBusRepository() {
        destinoBusList = new ArrayList<>(List.of(new DestinoBus("1", "Calle 30"),
             new DestinoBus("2", "Padro"),
             new DestinoBus("3", "Concord"),
             new DestinoBus("4", "Panorama"),
             new DestinoBus("5", "Buenavista"),
             new DestinoBus("6", "La playa")
                ));
    }

    public void agregarDestino(DestinoBus destinoBus){
        destinoBusList.add(destinoBus);
    }

    public List<DestinoBus> getDestinos(){
        return destinoBusList;
    }

    public void setDestinos(List<DestinoBus> destinoBuses) {
        this.destinoBusList = destinoBuses;
    }


}
