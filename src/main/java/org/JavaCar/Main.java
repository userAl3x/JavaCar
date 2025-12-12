package org.JavaCar;

import java.util.List;              //Importamos la clase List
import java.util.ArrayList;         //Importamos la clase ArrayList

public class Main {
    public static void main(String[] args) {
        //Creamos las clases de los vehiculos Coche, Moto y Furgoneta con los motores y ruedas 
        Motor motorCoche = new Motor("Gasolina", 100);      //Instancia de motor
        Roda rodesCoche = new Roda("Michelin", 17);         //Instancia de RUeda

        Motor motorMoto = new Motor("Gasolina", 80);
        Roda rodesMoto = new Roda("Pirelli",14);

        Motor motorFurgoneta = new Motor("Gasolina", 120);
        Roda rodesFurgoneta = new Roda("Michelin", 17);
        
        //Creamos las instancias de los vehiculos (objeto creado a partir de una clase)
        Cotxe cotxe = new Cotxe("1234ABCD", "Toyota", "Corolla", 10000, motorCoche, rodesCoche, "ECO", 5);
        Moto moto = new Moto("2341FGDE", "Honda", "CBR1000RR", 15000, motorMoto, rodesMoto, "ECO", 1000);
        Furgoneta furgoneta = new Furgoneta("3456HIJK", "Mercedes", "Sprinter", 20000, 1000, motorFurgoneta, rodesFurgoneta, "ECO");

        //Creamos la lista de vehiculos
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(cotxe);         //Cotxe es un vehicle, herencia y interfaz
        vehicles.add(moto);
        vehicles.add(furgoneta);

        //Calculamos los ingresos totales de los vehiculos
        double ingresosTotales = GestorLlogers.calcularIngresosTotales(vehicles, 7);
        System.out.println("\nLos ingresos totales de los vehiculos por 7 dias son: " + ingresosTotales + " €");

        //Filtramos los vehiculos por precio
        List<Vehicle> vehiculosFiltrados = GestorLlogers.filtrarPorPrecio(vehicles, 10000);
        System.out.println("\nLos vehiculos filtrados por precio son: " + vehiculosFiltrados + "\n");
    }
}