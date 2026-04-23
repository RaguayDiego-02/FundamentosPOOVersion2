package org.diegoraguay.model;

public class Aguila extends AnimalesSalvajes{
    private boolean tieneGarras; 
    
    public void volar(){
        System.out.println("El aguila a volado");
    }
    
    public boolean gettieneGarras(){
        return this.tieneGarras; 
    }
    
    public void settieneGarras(boolean tieneGarras){
        this.tieneGarras = tieneGarras; 
    }
}
