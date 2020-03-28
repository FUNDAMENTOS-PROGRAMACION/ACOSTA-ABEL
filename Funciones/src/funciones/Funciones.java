/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
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
        
        String ubicacionArchivo = "archivoPrueba.txt";
        String contenidoArchivo = "Este es un archivo creado en JAVA";
// declarar archivos
// File es importado de java.io
        File archivo = new File(ubicacionArchivo);
        if(archivo.exists())
        {
            System.out.println("archivo ya existe");
        }
        else{
                try { // si esta bien no pasa nada se ejecuta normalmente el try
// importado de java.io
            archivo.createNewFile();
            FileWriter escribirArchivo = new FileWriter(archivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escribirArchivo);
            bufferEscritura.write(contenidoArchivo);
            bufferEscritura.close();
            } catch (IOException ex) { // capturar errores del try
        System.out.println("Error al crear archivo");
            }
        }       
    }  //final main
    
    
}//final total
