/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author ABEL
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arregloNumero[] = new int[]{1,25,9,8,15};
        
        for(int i=0; i<arregloNumero.length; i++){
            System.out.println("Valor indice "+ i + "  Valor arreglo  "+arregloNumero[i]);
        }
        
        
        String arregloLetras[] = new String[]{"a","x","z"};
        System.out.println("ARREGLO LETRAS");
        System.out.println(arregloLetras[2]);
        
        for(int i=0; i<arregloLetras.length; i++){
            
            if(arregloLetras[i]=="x"){
                
                String localv="hola soy una variable local";
                System.out.println(localv);
                System.out.println("es verdadero es x");
            }else{
                 System.out.println("es falso");
                
            }
            System.out.println("Valor indice "+ i + "  Valor arreglo  "+arregloLetras[i]);
        }
        System.out.println("TAMAÑO DE ARREGLOS");
        System.out.println(arregloNumero.length);
        
        //final main
    }
    
}
