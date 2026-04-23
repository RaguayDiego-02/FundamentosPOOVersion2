package org.diegoraguay.model;

public class Lobo extends AnimalesSalvajes{
    private boolean vaEnManada;
    
    public void aullar(){
    System.out.println("El lobo a aullado");
    }
    
    public boolean getvaEnManada(){
    return this.vaEnManada; 
    }
    
    public void setvaEnManada(boolean vaEnManada){
    this.vaEnManada = vaEnManada; 
    }
}
