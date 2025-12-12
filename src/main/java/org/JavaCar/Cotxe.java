package org.JavaCar;

//Clase que hereda de Vehicle y implementa Llogable
public class Cotxe extends Vehicle {
    private int numeroPlazas;

    //Constructor de la clase Cotxe
    public Cotxe(String matricula, String marca, String model, double precioBase, Motor motor, Roda ruedas, String etiquetaAmbiental, int numeroPlazas){
        super(matricula, marca, model, precioBase, motor, ruedas, etiquetaAmbiental);
        this.numeroPlazas = numeroPlazas;
    }
    
    //Metodo para calcular el precio del coche  
    @Override
    public double calcularPrecio(int dias){
        return getPrecioBase() * dias;
    }

    //Metodo ToString de la clase Cotxe
    @Override
    public String toString() {
    return "Cotxe{" +
            " matricula = '" + getMatricula() + '\'' +
            ", marca = '" + getMarca() + '\'' +
            ", model = '" + getModel() + '\'' +
            ", precioBase = " + getPrecioBase() +
            ", numeroPlazas = " + numeroPlazas +
            '}';
    }
}
