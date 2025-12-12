package org.JavaCar;

public class Moto extends Vehicle {
    private int cilindrada;

    //Constructor de la clase Moto
    public Moto(String matricula, String marca, String model, double precioBase, Motor motor, Roda ruedas, String etiquetaAmbiental, int cilindrada) {
        super(matricula, marca, model, precioBase, motor, ruedas, etiquetaAmbiental);
        this.cilindrada = cilindrada;
    }

    //Metodo para obtener la cilindrada de la moto
    public int getCilindrada() {
        return cilindrada;
    }

    //Metodo para calcular el precio de la moto
    @Override
    public double calcularPrecio(int dias) {
        double precio = getPrecioBase() * dias;
        if (cilindrada >= 500) {
            precio += 5 * dias;
        }
        return precio;
    }

    //Metodo ToString de la clase Moto
    @Override
    public String toString() {
    return "Moto{" +
            "matricula = '" + getMatricula() + '\'' +
            ", marca = '" + getMarca() + '\'' +
            ", model = '" + getModel() + '\'' +
            ", precioBase = " + getPrecioBase() +
            ", cilindrada = " + cilindrada +
            '}';
    }
}
