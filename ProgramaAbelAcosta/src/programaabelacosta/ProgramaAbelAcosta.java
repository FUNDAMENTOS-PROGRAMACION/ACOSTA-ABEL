/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaabelacosta;

/**
 *
 * @author ABEL
 */
public class ProgramaAbelAcosta {

    /**
     * @param args the command line arguments
     */
    
    
     // DECLARAR VARIABLES
    int varNumero = 5;  // variable numerica
    String varPalabra = "Hola Como Estas";  // variable strinf 
    char  varCaracter = 'a';  // variable char o caracter
    boolean varbooleana = false;  // variable boolena
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    propiedadesString();
    
        
        
    }//FIN MAIN
    
    
            //PROPIEDADES O MÉTODOS DE STRING
    public static void propiedadesString(){
        System.out.println("INICIO PROPIEDADES O METODOS STRING");
        
        System.out.println("Utiliza salto de linea\n"+ "Abel \nAcosta");
        // para salto de linea \n  
        System.out.println("Utiliza tabulador:" + " Ab \t el \t"+ "Acos \t ta");
        //sirve para tabular \t da un espacio 
        System.out.println("Utiliza borrar a la izquierda:" + " Ab\bel"+ " Acos\bta");
        // \b -> borrar a la izquiera
        System.out.println("Utiliza retroceder:" + " Abel"+ " Acos\rta");
        // \r -> retroceder
        System.out.println("Utiliza comenzo pagina:" + " Abel"+ " Acos\fta");
        // \f  -> comenzo de pagina
        
        
        String nombreCompleto = "  Abel Acosta  ";
        
        System.out.println("Numero de caracteres de la variable nombreCompleto es: "+ nombreCompleto.length());
       
        System.out.println("Variable con espacios:"+nombreCompleto);
        System.out.println("Variable sin espacios en blanco al incio o final:"+ nombreCompleto.trim());
        System.out.println("Utiliza toUpperCase:"+ nombreCompleto.toUpperCase());
        System.out.println("Utiliza toLowerCase:"+ nombreCompleto.toLowerCase());
        System.out.println("Se utiliza replace para reemplazar: "+nombreCompleto+" por "+nombreCompleto.replace(nombreCompleto, "Sebastián Acosta"));
        System.out.println("Utiliza retroceder:" + " Abel"+ " Acos\rta");
        
    }//FIN PROPIEDADES STRING
    //
}//FIN PPAL
