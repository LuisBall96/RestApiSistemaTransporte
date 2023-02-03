package com.example.RestApiSistemaTransporte.repository.model;

public class Pasajero extends Persona{
        private int ID;

        public Pasajero(String nombre) {
            super(nombre);
        }

        public Pasajero(String nombre, int ID) {
            super(nombre);
            this.ID = ID;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }

