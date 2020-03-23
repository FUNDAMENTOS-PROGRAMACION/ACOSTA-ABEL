/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author ABEL
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int matrizNumeros[][];
        matrizNumeros = new int[2][2];
        
        for(int inicioF = 0; inicioF < matrizNumeros.length; inicioF++){
            for(int inicioC = 0; inicioC <matrizNumeros[inicioF].length; inicioC++ ){
                System.out.println("ingresando valores" + inicioF );
                matrizNumeros[inicioF][inicioC] =2;
                
            }
        }
    }  //fin main
    
}
