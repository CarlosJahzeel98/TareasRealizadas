/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
      int notafinal;
        int nota1;
    int nota2;
    int nota3;
    int prom;
    
    Scanner dato=new Scanner (System.in);
    System.out.print("Nombre :");
    nombre = dato.next();
    
    
    System.out.print("nota 1: ");
    nota1=dato.nextInt();
             
    System.out.print("nota 2: ");
    nota2=dato.nextInt();
               
    System.out.print("nota 3:  ");
    nota3=dato.nextInt();
               
    prom=(nota1+nota2+nota3)/3;
    System.out.print(" ElPromedio Final es =");
    System.out.println(prom);
              
    if(prom<70){
    System.out.print("Reprobado");
    }else{
    System.out.print("Aprobado");
    }
}
      
      
      
        
               
    }
    

