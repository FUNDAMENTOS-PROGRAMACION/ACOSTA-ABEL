/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author ABEL
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONDICIONALES
        int opcion =1;
        //  ==
        //>=
        //!=
        if (opcion != 10){
            
            System.out.println("es verdadero");
            
        } else {
            
        System.out.println("es falso son diferentes");
        }
        String ola= "b";
        switch(ola){
        
            case "a":

                System.out.println("Ingreso a la opcion 1");

            break;

            case "b": 

                System.out.println("Ingreso a la opcion b");

            break;

            default: 

                System.out.println("Opcion default");    
        }
        
        System.out.println("FOR");
        
        
        for(int inicio=0; 100>inicio; inicio++){
            
        System.out.println(inicio);
        }
        
        
        System.out.println("WHILE");
        
        int cont=0;
        
        while(cont<10){
            System.out.println(cont);
            
            cont++;
        }
        
         System.out.println("DO-WHILE");
        
        
         int contador =0;
         do{
              System.out.println(contador);
              contador++;
         }while(contador<10);
                
                 
        //final main
    }
    
}
