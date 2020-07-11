/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author LENOVO
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double suma, resta, multiplicaion, division =0;
        
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        
        double numero1 =50;
        double numero2 =25;
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        
        if (numero2 !=0){
        division = numero1 / numero2;
        }
        System.out.println("La suma es:" + suma);
         System.out.println("La resta es:" + resta);
         System.out.println("La multiplicacion es:" + multiplicacion);
         System.out.println("La division es:" + division); 
    } 
}
