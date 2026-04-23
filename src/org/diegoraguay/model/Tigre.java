package org.diegoraguay.model;

public class Tigre extends AnimalesSalvajes{
    private boolean tieneRayas; 
    
    public void rugido(){
    System.out.println("El tigre a rugido");
    }
    
    public boolean gettieneRayas(){
    return this.tieneRayas; 
    }
    
    public void settienerayas(boolean tieneRayas){
    this.tieneRayas = tieneRayas; 
    }
}
