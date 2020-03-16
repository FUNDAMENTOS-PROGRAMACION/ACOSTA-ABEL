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
        
        switch('a'){
        
            case 1:

                System.out.println("Ingreso a la opcion 1");

            break;

            case 2: 

                System.out.println("Ingreso a la opcion 1");

            break;

            default: 

                System.out.println("Opcion default");    
        }
        
        for(int inicio=0; 100>inicio; inicio++){
            
        System.out.println(inicio);
        }
        
    }
    
}
