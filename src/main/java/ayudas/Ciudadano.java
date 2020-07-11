/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudas;

/**
 *
 * @author LENOVO
 */
public class Ciudadano {
    
   
    private String nombre;
    private int edad;
    private String añosexp;
     
     public Ciudadano(String nombre, String añosexp){
    this.nombre = nombre;
    this.añosexp = añosexp;
         

    }
     
    
    public void salidaañosexp(){
        System.out.println(añosexp);
    }
    
    public void veredad(int _edad){
        this.edad = _edad;
    }
    public int obteneredad(){
        return edad;
    }
    public void salidanombre(){
        System.out.println(nombre);
    }

   
    }

