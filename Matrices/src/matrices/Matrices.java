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
        
        
        int matrizPpal[][];
        matrizPpal = new int[4][3];
        
        for(int iFila = 0; iFila < matrizPpal.length; iFila++){
            for(int iColumna = 0; iColumna <matrizPpal[iFila].length; iColumna++ ){
               System.out.println("Valor ingresado en posicion: ["+iFila+"," +iColumna+ "]");
                matrizPpal[iFila][iColumna] = 3+iFila+iColumna;
                
            }
        }
        
        for(int iFila = 0; iFila < matrizPpal.length; iFila++){
        for (int iColumna = 0; iColumna < matrizPpal[iFila].length; iColumna++) {
        System.out.println("El valor en la posicion ["+iFila+"," +iColumna+ "] es:");
        System.out.println(matrizPpal[iFila][iColumna]);
        }
        }
        
    }  //fin main
    
}
