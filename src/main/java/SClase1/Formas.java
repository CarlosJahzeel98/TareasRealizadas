/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SClase1;

/**
 *
 * @author LENOVO
 */
public class Formas {
    
    private String nombre;
    private String color;
    private String dibujar;
    private String establecercolor;
    
    public Formas(){
        
    }
        
        public void establecerNombre(String nombre){
           this.nombre = nombre; 
        }
        public String obtenerNombre(){
            return this.nombre;
                 
    }
    public void establecerColor (String color ){
        this.color = color;
        
    }
    public String obtenerColor(){
        return this.color;
    }
       public void establecerDibujar (String dibujar ){
        this.dibujar = dibujar;
        
    }
    public String obtenerDibujar(){
        return this.dibujar;
    }
       public void establecerColor2 (String establecercolor ){
        this.establecercolor = establecercolor;
        
    }
    public String obtenerColor2(){
        return this.establecercolor;
    }
    public void imprimirInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Color: " + color);
        System.out.println("Dibujo:  " + dibujar);
        System.out.println("Calculo: " + establecercolor);
    }
}
