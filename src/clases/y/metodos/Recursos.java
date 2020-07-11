
package clases.y.metodos;

import java.util.Scanner;



//CLASE

public class Recursos {
   
      String mensaje;
      int a;
      float i=0;
      float o=1;
      int number;
      int listas;
      double resultado;
    
    //METODO
    public static void main(String[] args) { //PRIMER METODO
        // TODO code application logic here
         Recursos recursos1;
    recursos1=new Recursos();
    recursos1.nota();
    recursos1.division();
    recursos1.lista();
    
      Recursos recurso1 =  new Recursos();
    recurso1.mensaje = "Estoy Aprendiendo, pero sere el mejor programador del mundo.";
    
    System.out.println("Rotulo: "+recurso1.mensaje);
    
  

     
    }
    


public int nota(){ //SEGUNDO METODO
     Recursos obj=new Recursos();
   
     Scanner dato=new Scanner (System.in);
     Recursos recurso2 =  new Recursos();
    
     System.out.print("Ingrese la nota del alumno:\n ");
   a=dato.nextInt();
      if(a>=70){
    System.out.print("Aprobado\n");
    }else{
    System.out.print("Reprobado\n");
    }
    
    

    return a;
    
}



public float division(){ //TERCER METODO
    
    Scanner reader = new Scanner(System.in);
    try {
      System.out.print("Ingrese un numero para dividirlo: \n");
    i = reader.nextFloat();
       System.out.print("Ingrese un segundo numero para dividirlo:\n ");
   o = reader.nextFloat();
   resultado= i/o;
   
   if(o!=0){
       return i/o;}
    System.out.print("El resultado de la division es: \n"+resultado);
  } catch (ArithmeticException ae) {
        System.out.print("No se puede dividir entre 0.\n"+o); 
        return 0;
} 
          return 0;
}

public void lista(){ //CUARTO METODO
      Scanner dato=new Scanner (System.in);
    int[] listas= null;
    System.out.print(" \n Ingrese un numero: \n");
     number=dato.nextInt();
    if(number>0){
        listas = new int[number + 1];
        
        for(int z = 1; z<listas.length; z++){
            listas [z] = z;
            System.out.println(listas[z]);
            
        }
    }
    
} 

public static void main(String[] arg[]) {
    Recursos recursos1;
    recursos1=new Recursos();
    recursos1.nota();
    recursos1.division();
    recursos1.lista();
    
    
    
   
   
    }
}



    
    


