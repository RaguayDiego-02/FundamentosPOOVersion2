package org.diegoraguay.model;

public class Cocodrilo extends AnimalesSalvajes{
    private boolean tieneEscamas; 
    
    public void nadar(){
    System.out.println("El cocodrilo a nadado");
    }
    
    public boolean gettieneEscamas(){
    return this.tieneEscamas; 
    }
    
    public void settieneEscamas(boolean tieneEscamas){
    this.tieneEscamas = tieneEscamas; 
    }
    
}
