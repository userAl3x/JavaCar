package org.JavaCar;

public class Motor {
    private String tipo;
    private int potencia;
    
    //Constructor de la clase Motor
    public Motor(String tipo, int potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    //Getters
    public String getTipo(){
        return tipo;
    }
    public int getPotencia(){
        return potencia;
    }
}
