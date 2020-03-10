/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
//package y nombre de paquete
/**
 *
 * @author ABEL
 */
public class Clase1 {
// public class nombre clase
    /**
     * @param args the command line arguments
     */
    //entero -32768 a 32767
    int numeroEntero = 5;
    double numeroDouble = 6.89;
    char letra = 'u';
    String cadena = "Hola Mundo";
    //String nombre variable y el valor entre comillas dobles
    boolean buleano = false;
    //buleano = true;
    boolean buleano2 = false;
    
    
    public static void main(String[] args) {
        // TODO code application logic hHLLISere
        // comentario una linea
        // comentario en linea
        
        imprimirNombre();
        sumar2Numeros(5,8);
        System.out.println(sumar2Numeros(5,8));
    }
    
    public static void imprimirNombre(){
        System.out.println("Abel");
    }
    
    public static int sumar2Numeros(int num1, int num2){
        int suma= num1+num2;
        return suma;
    }
}
