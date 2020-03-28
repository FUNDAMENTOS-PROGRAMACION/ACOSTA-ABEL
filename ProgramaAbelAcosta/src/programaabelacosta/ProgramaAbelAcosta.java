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
import java.io.BufferedWriter;//Paquetes para crear archivo 
import java.io.File;//Paquetes para crear archivo 
import java.io.FileWriter;//Paquetes para crear archivo 
import java.io.IOException;//Paquetes para crear archivo 
import java.util.Scanner; //importa scanner para pedir al usuario valores


public class ProgramaAbelAcosta {

    /**
     * @param args the command line arguments
     */
    
    
     // DECLARAR VARIABLES
    int varNumero = 5;  // variable numerica
    String varPalabra = "Hola Como Estas";  // variable string 
    char  varCaracter = 'a';  // variable char o caracter
    boolean varbooleana = false;  // variable boolena
    
   
        
    public static void main(String[] args) {  
   // CONDICIONAL SWITCH ES UTILIZADO PARA EL MENU PRINCIPAL
        System.out.println("PORFAVOR INGRESE EL NUMERO DE LA OPCION PARA LA EJECUCION");
        System.out.println("1.- Propiedades de String");
        System.out.println("2.- Condicionales");
        System.out.println("3.- Bucles");
        System.out.println("4.- Arreglos");
        System.out.println("5.- Matrices");
        System.out.println("6.- Funciones básicas");
        System.out.println("7.- Archivo");
        
         Scanner myVar = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        int oso =myVar.nextInt();
        
        switch(oso){
        
        case 1: 
             System.out.println("Ingrese su nombre");
             Scanner myNombre = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        String nombre =myNombre.nextLine();
        
        propiedadesString(nombre);
        break;
       case 2: 
           
           System.out.println("Ingrese su edad");
           
            Scanner myEdad = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        int edad =myEdad.nextInt();
        
        condicionesEdad (edad);
        break;
           
       case 3: 
           System.out.println("Ingrese hasta que numero desea ejecuten los bucles");
           
           Scanner num1 = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        int numf =num1.nextInt();
        
        bucles(numf);
        
        break;
       case 4: 
        arreglos();
        break;
       case 5:
           matrices();
        break;
           
       case 6:
           System.out.println("Ingrese un numero");
           
           Scanner num2 = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        int num3 =num2.nextInt();
           System.out.println("Ingrese otro numero");
        Scanner num4 = new Scanner(System.in);//LINEA PARA RECIBIR DATO DEL USUARIO
        int num5 =num4.nextInt();
        System.out.println("la suma de "+num3 + " + " + num5 +" es: " + suma(num3,num5));
        System.out.println(saludar());
        break;
           
       case 7:
           archivo();
       break;
    }
        
        
    
        
        
    }//FIN MAIN
    
    
            //PROPIEDADES O MÉTODOS DE STRING
    public static void propiedadesString(String nombreCompleto){
        
        
        // String nombreCompleto = "  Abel Acosta  ";
        
        System.out.println("Numero de caracteres de su nombreCompleto es: "+ nombreCompleto.length());
       
        System.out.println("Variable con espacios:"+nombreCompleto);
        System.out.println("Variable sin espacios en blanco al incio o final:"+ nombreCompleto.trim());
        System.out.println("Utiliza toUpperCase:"+ nombreCompleto.toUpperCase());
        System.out.println("Utiliza toLowerCase:"+ nombreCompleto.toLowerCase());
        System.out.println("Se utiliza replace para reemplazar: "+nombreCompleto+" por "+nombreCompleto.replace(nombreCompleto, "Sebastián Acosta"));
        
        
        
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
        System.out.println("Utiliza retroceder:" + " Abel"+ " Acos\rta");
        
        System.out.println("VOLVER A EJECUTAR PROGRAMA PARA REGRESAR AL MENU");
        
    }//FIN PROPIEDADES STRING
    
    public static void condicionesEdad (int dato){// CONDICIONALES IF ELSE IF 
        
        if (dato <18  && dato >= 0){
            System.out.println("Eres menor de edad");
        }else if(dato >0  && dato >=18){
        System.out.println("Eres mayor de edad");
        }else{
           System.out.println("No es valido el numero ingresado"); 
        }
    
     System.out.println("VOLVER A EJECUTAR PROGRAMA PARA REGRESAR AL MENU");
    }//FIN CONDICIONALES
    
    public static void bucles(int num){
        
        System.out.println("Utilizando for aparecen numeros del 1 al " + num);
        
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
        
        System.out.println("Utilizando while aparecen numeros del 1 al " + num);
        int i=0;
        int sumador=0;
        while( i < num){
            
           i++;
           sumador =sumador + i;
        System.out.println(i);
        }
        System.out.println("la suma total de los numero que aparecieron es:" + sumador);
        
        System.out.println("Utilizando do while aparecen bienvenido  " + num + " veces");
        int cuenta =0;
        do{
            System.out.println("bienvenido" + cuenta + "veces");
            cuenta++;
        }while(cuenta < num);
        
        System.out.println("VOLVER A EJECUTAR PROGRAMA PARA REGRESAR AL MENU");
    }
   
   
    public static void arreglos(){
        
         int arregloNumero[] = new int[]{1,25,9,8,15};
        
        for(int i=0; i<arregloNumero.length; i++){
            System.out.println("Valor indice "+ i + "  Valor arreglo  "+arregloNumero[i]);
        }
        
        
        String arregloLetras[] = new String[]{"a","x","z"};
        System.out.println("ARREGLO LETRAS");
        System.out.println(arregloLetras[2]);
        
        for(int i=0; i<arregloLetras.length; i++){
            
            if(arregloLetras[i] == "x"){
                
                String localv="hola soy una variable local";
                System.out.println(localv);
                System.out.println("es verdadero es x");
            }else{
                 System.out.println("es falso");
                
            }
            System.out.println("Valor indice "+ i + "  Valor arreglo  "+arregloLetras[i]);
        }
        System.out.println("TAMAÑO DE ARREGLOS");
        System.out.println("Arreglo de numeros es:" + arregloNumero.length);
        System.out.println("Arreglo de letras es:" + arregloLetras.length);
        
        System.out.println("VOLVER A EJECUTAR PROGRAMA PARA REGRESAR AL MENU");
    }
    
    public static void matrices(){
        
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
        
        System.out.println("VOLVER A EJECUTAR PROGRAMA PARA REGRESAR AL MENU");
    }
    //funciones basica sumar
    public static int suma(int num1, int num2){
        int sumar= num1 + num2;
        return sumar;
       
    }
    //funciones basica saludar
    public static String saludar(){
        return "hola";
    }
    
    public static void archivo(){
          String ubicacionArchivo = "archivoPrueba.txt";
        String contenidoArchivo = "Este es un archivo creado en JAVA";
// declarar archivos
// File es importado de java.io
        File archivo = new File(ubicacionArchivo);
        if(archivo.exists())
        {
            System.out.println("El archivo ya existe");
        }
        else{
                try { 
            archivo.createNewFile();
            FileWriter escribirArchivo = new FileWriter(archivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escribirArchivo);
            bufferEscritura.write(contenidoArchivo);
            bufferEscritura.close();
            } catch (IOException ex) { // capturar errores del try
        System.out.println("Error al crear archivo");
            }
        }       
        
    }
    
    
    //
}//FIN PPAL
