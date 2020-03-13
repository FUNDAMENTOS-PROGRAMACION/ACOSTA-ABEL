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
        
        System.out.println("Las ocpciones son iguales");
        
   
        
    }
    
    public static void imprimirNombre(){
        System.out.println("Utiliza salto de linea\n"+"Abel \nAcosta");
        // para salto de linea \n  
        System.out.println("Utiliza tabulador:" + " Ab \t el");
        //sirve para tabular \t da un espacio 
        // \b -> borrar a la izquiera
        // \f  -> comenzo de pagina
        // \r -> retroceder
        
        // .length() el numero de letras de una cadena de caracteres
        //.trim() -> elimina los espacios en blanco y solo queda la palabra
        
        String cadena = "Abel";
        System.out.println("Numero de caracteres es: "+ cadena.length());
        
        String cadena2 = " Acosta  ";
        System.out.println("Elimina espacios en blanco");
        System.out.println(cadena2.trim());
        System.out.println("Utiliza toUpperCase"+ cadena2.toUpperCase());
        System.out.println("Utiliza toLowerCase"+ cadena2.toLowerCase());
        System.out.println("Se utiliza replace para reemplazar "+cadena+" por "+cadena.replace(cadena, "hola"));
    }
    
    public static int sumar2Numeros(int num1, int num2){
        
        int suma= num1+num2;
        return suma;
        
    }
    
    
}
