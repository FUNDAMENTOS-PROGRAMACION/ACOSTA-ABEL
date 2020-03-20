/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author ABEL
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println(suma(1,5));
        System.out.println(saludar());
       
    }  //final main
    
    
    public static int suma(int num1, int num2){
        int sumar= num1 + num2;
        return sumar;
       
    }
    
    public static String saludar(){
        return "hola";
    }
}//final total
