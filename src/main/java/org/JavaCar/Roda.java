package org.JavaCar;

public class Roda {
    private String marca;
    private int diametro;

    //Constructor de la clase Roda
    public Roda(String marca, int diametro){
        this.marca = marca;
        this.diametro = diametro;
    }

    //Getters
    public String getMarca(){
        return marca;
    }
    public int getDiametro(){
        return diametro;
    }
}
