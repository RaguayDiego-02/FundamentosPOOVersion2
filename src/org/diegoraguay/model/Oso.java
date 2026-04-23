package org.diegoraguay.model;

public class Oso extends AnimalesSalvajes{
    private double peso; 
    
    public void hibernar(){
    System.out.println("El oso a hibernado");
    }
    
    public double getpeso(){
    return this.peso; 
    }
    
    public void setpeso(double peso){
    this.peso = peso; 
    }
    
}
