/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareherencia;

import SClase1.Circulo;
import SClase1.Cuadrado;
import SClase1.Linea;
import SClase1.Triangulo;


/**
 *
 * @author LENOVO
 */
public class TareHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        
        
        
        System.out.println("Forma 1");
        
        circulo.imprimirInformacion();
        
        System.out.println("Forma 2");
        
        linea.imprimirInformacion();
        
        System.out.println("Forma 3");
        
        triangulo.imprimirInformacion();
        
        System.out.println("Forma 4");
        
        cuadrado.imprimirInformacion();
        
        
        
    }
    
}
