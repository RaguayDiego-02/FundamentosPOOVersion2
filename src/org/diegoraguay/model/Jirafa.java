package org.diegoraguay.model;

public class Jirafa extends AnimalesSalvajes{
    private boolean cuelloLargo; 
    
    public void alcanzarHojas(){
    System.out.println("La jirafa alcanza las hojas de los arboles");
    }
    
    public boolean getcuelloLargo(){
        return this.cuelloLargo;
    }
    
    public void setcuelloLargo(boolean cuelloLargo){
        this.cuelloLargo = cuelloLargo; 
    }
}
