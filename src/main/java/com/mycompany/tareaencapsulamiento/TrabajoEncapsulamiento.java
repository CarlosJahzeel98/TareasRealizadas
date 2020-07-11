/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareaencapsulamiento;

import ayudas.Ciudadano;

/**
 *
 * @author LENOVO
 */
public class TrabajoEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ciudadano ciudadano = new Ciudadano("Chris Perez", "Cuarenta años de experencia");
        
        ciudadano.salidanombre();
        ciudadano.salidaañosexp();
        
        
        
        //establecer valor a variable privada
        ciudadano.veredad(52);
        
        System.out.println(ciudadano.obteneredad());
        
    }
    
}
