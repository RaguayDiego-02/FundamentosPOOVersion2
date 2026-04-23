package org.diegoraguay.model;

public class Leon extends AnimalesSalvajes{
    private boolean tieneColmillos; 
    
    public void aranazo(){
    System.out.println("El leon ha dado un aranazo");
    }
    
    public boolean getcolmillos(){
    return this.tieneColmillos; 
    }
    
    public void setcolmillos(boolean tieneColmillos){
    this.tieneColmillos = tieneColmillos; 
    }
}
