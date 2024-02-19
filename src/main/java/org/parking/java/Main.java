package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;


public class Main {
    public static void main(String[] args) {
        //Sistema de gestion de E/S 
        //de vehiculos en un parqueadero
        //1. dos carritos:
        //objetos (intancias)
        //2. tipo de clase
        //#. asignacion y new
        //4.constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.TAXI);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo.TAXI;
        
        Vehiculo carrito2 = new Vehiculo("FVK 567", TipoVehiculo.CAMION);
        carrito2.placa = "FVK 567";
        carrito2.tipoVehiculo = TipoVehiculo.CAMION;

        System.out.println(carrito1.placa);
        System.out.println(TipoVehiculo.TAXI);

        //crear(intanciar)un cliente
        Cliente cliente1 = new Cliente("diego", "marin", 1234123L);
        cliente1.nombres = "diego";
        cliente1.apellidos= "marin";
        cliente1.numeroIdentificacion = 1234123L;
        //invocar el metodo invocar 
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("GWW 999", TipoVehiculo.MOTO);
        //recorer la lista de vehiculos del cliente
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("---------");
        }
    }   
}