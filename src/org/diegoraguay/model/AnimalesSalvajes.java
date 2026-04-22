package org.diegoraguay.model;

public class AnimalesSalvajes {
   private boolean pelaje; 
  
   public void comer(){
    System.out.println("El animal esta comiendo");
   }
   
   //get
   public boolean getpelaje(){
    return this.pelaje; 
   }
   
   //set
   public void setpelaje (boolean pelaje){
    this.pelaje = pelaje; 
   }
}
