package org.parking.java.entities;

public class Vehiculo {


    //atributos de clase
    //1. modificador de acceso
    //2. tipo de dato atributo
    //3. nombre del atributo
    public String placa;
    public TipoVehiculo tipoVehiculo;
    //constructor
    //sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor con parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    
}
