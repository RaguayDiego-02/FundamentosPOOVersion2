package org.diegoraguay.model;

public class Serpiente extends AnimalesSalvajes{
    private boolean esVenenosa; 
    
    public void morder(){
    System.out.println("La serpiente a mordido");
    }
    
    public boolean getesVenenosa(){
    return this.esVenenosa;
    }
    
    public void setesVenenosa(boolean esVenenosa){
    this.esVenenosa = esVenenosa; 
    }
    
}
