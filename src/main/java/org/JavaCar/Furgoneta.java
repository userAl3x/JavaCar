package org.JavaCar;

//Clase Furgoneta heredada de vehicle que implemnta la interfaz llogable
public class Furgoneta extends Vehicle{
    private int capacidadCarga;

    //Constructor de la clase Furgoneta
    public Furgoneta(String matricula, String marca, String model, double precioBase, int capacidadCarga, Motor motor, Roda ruedas, String etiquetaAmbiental){
        super(matricula, marca, model, precioBase, motor, ruedas, etiquetaAmbiental);
        this.capacidadCarga = capacidadCarga;
    }

    //Metodo para obtener la capacidad de carga de la furgoneta
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    //Metodo para calcular el precio de la furgoneta    
    @Override
    public double calcularPrecio(int dias) {
        double precio = getPrecioBase() * dias;
        if (capacidadCarga > 1000) {
            precio += 10 * dias;
        }
        return precio;
    }

    //Metodo ToString de la clase Furgoneta
    @Override
    public String toString() {
        return "Furgoneta{" +
                "matricula = '" + getMatricula() + '\'' +
                ", marca = '" + getMarca() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", precioBase = " + getPrecioBase() +
                ", capacidadCarga = " + capacidadCarga +
            '}';
    }
}
