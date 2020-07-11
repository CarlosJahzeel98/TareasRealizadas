/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracciontarea;

import ayuda.EstadosUnidos;
import ayuda.Honduras;
import ayuda.Mexico;


/**
 *
 * @author LENOVO
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Honduras as = new Honduras ();
        EstadosUnidos ad = new EstadosUnidos ();
        Mexico af = new Mexico();
        
       
         System.out.println("1. Juan Orlando Hernandez \n "+as.getPais());
         System.out.println("2. Donald Trump \n"+ad.getPais());
         System.out.println("3. Manuel Lopez Obrador \n"+af.getPais());
    }

 
  
    
}
