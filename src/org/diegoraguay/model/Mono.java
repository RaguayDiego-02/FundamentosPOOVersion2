package org.diegoraguay.model;

public class Mono extends AnimalesSalvajes{
    private boolean tienePulgares; 
    
    public void trepar(){
    System.out.println("El mono a trepado un arbol");
    }
    
    public boolean gettienePulgares(){
    return this.tienePulgares; 
    }
    
    public void settienePulgares(boolean tienePulgares){
    this.tienePulgares = tienePulgares; 
    }
}

