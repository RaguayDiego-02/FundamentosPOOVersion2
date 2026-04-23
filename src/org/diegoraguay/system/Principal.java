package org.diegoraguay.system;

import org.diegoraguay.model.*;

public class Principal {
    public static void main(String[] args) {
        
        Leon leon = new Leon();
        leon.comer();
        leon.aranazo();
        
        Tigre tigre = new Tigre();
        tigre.comer();
        tigre.rugido();
        
        Elefante elefante = new Elefante();
        elefante.comer();
        elefante.barrito();
        
        Serpiente serpiente = new Serpiente();
        serpiente.comer();
        serpiente.morder();
        
        Jirafa jirafa = new Jirafa();
        jirafa.comer();
        jirafa.alcanzarHojas();
        
        Aguila aguila = new Aguila();
        aguila.comer();
        aguila.volar();
        
        Mono mono = new Mono();
        mono.comer();
        mono.trepar();
        
        Lobo lobo = new Lobo();
        lobo.comer();
        lobo.aullar();
        
        Oso oso = new Oso();
        oso.comer();
        oso.hibernar();
        
        Cocodrilo cocodrilo = new Cocodrilo();
        cocodrilo.comer();
        cocodrilo.nadar();
    }
}