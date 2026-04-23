package org.diegoraguay.model;

public class Elefante extends AnimalesSalvajes{
    private double pesoElefante; 
    
    public void barrito(){
    System.out.println("El elefante a hecho barrito");
    }
    
    public double getpesoElefante(){
    return this.pesoElefante;
    }
    
    public void setpesoElefante(double pesoElefante){
    this.pesoElefante = pesoElefante; 
    }
}
