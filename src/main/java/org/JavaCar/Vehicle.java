package org.JavaCar;

//Clase Abstracta Vehicle que implementa Llogable
public abstract class Vehicle implements Llogable{
    protected String matricula;
    protected String marca;
    protected String model;
    private double precioBase;
    private Motor motor;
    private Roda ruedas;
    private String etiquetaAmbiental;   //Etiqueta ambiental del vehiculo

     //Constructor de la clase Vehicle
     public Vehicle(String matricula, String marca, String model, double precioBase, Motor motor, Roda ruedas, String etiquetaAmbiental){
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.precioBase = precioBase;
        this.motor = motor;
        this.ruedas = ruedas;
        this.etiquetaAmbiental = etiquetaAmbiental;
    }

    //Getters
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public double getPrecioBase(){
        return precioBase;
    }
    public Motor getMotor(){
        return motor;
    }
    public Roda getRuedas(){
        return ruedas;
    }
    public String getEtiquetaAmbiental(){
        return etiquetaAmbiental;
    }   
}
