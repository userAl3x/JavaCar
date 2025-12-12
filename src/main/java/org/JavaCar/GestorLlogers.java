package org.JavaCar;

import java.util.List;              //Importamos la clase List
import java.util.ArrayList;         //Importamos la clase ArrayList

//Clase GestorLlogers que gestiona los lloguers de los vehiculos
public class GestorLlogers   {

    //Metodo para calcular los ingresos totales de los vehiculos
    public static double calcularIngresosTotales(List<Vehicle> vehicles, int dias) {
        double ingresosTotales = 0;
        for (Vehicle vehicle : vehicles) {
            ingresosTotales += vehicle.calcularPrecio(dias);
        }
        return ingresosTotales;
    }

    //Metodo para filtrar los vehiculos por precio
    public static List<Vehicle> filtrarPorPrecio(List<Vehicle> vehicles, double precioMax) {
        List<Vehicle> vehiculosFiltrados = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.calcularPrecio(1) <= precioMax) {
                vehiculosFiltrados.add(vehicle);
            }
        }
        return vehiculosFiltrados;
    }    
}
