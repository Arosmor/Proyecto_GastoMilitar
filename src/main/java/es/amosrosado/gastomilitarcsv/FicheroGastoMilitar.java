
package es.amosrosado.gastomilitarcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javafx.stage.Stage;


public class FicheroGastoMilitar {

    public static void fichero(Stage stage) {
//    int valores = 0;
    String nombreFichero = "military-expenditure-total.csv";
    // Declarar una variable BufferedReader
    BufferedReader br = null;
    try {
        // Crear un objeto BufferedReader al que se le pasa 
        //   un objeto FileReader con el nombre del fichero
        br = new BufferedReader(new FileReader(nombreFichero));
        // Leer la primera línea, guardando en un String
        String texto = br.readLine();
        // Repetir mientras no se llegue al final del fichero
        while(texto != null) {
                String[] valores = texto.split(",");
                String nombre = valores[0];
                System.out.println(nombre);
            // Leer la siguiente línea
            texto = br.readLine();
        }
    }
    // Captura de excepción por fichero no encontrado
    catch (FileNotFoundException ex) {
        System.out.println("Error: Fichero no encontrado");
        ex.printStackTrace();
    }
    // Captura de cualquier otra excepción
    catch(Exception ex) {
        System.out.println("Error de lectura del fichero");
        ex.printStackTrace();
    }
    // Asegurar el cierre del fichero en cualquier caso
    finally {
        try {
            // Cerrar el fichero si se ha podido abrir
            if(br != null) {
                br.close();
            }
        }
        catch (Exception ex) {
            System.out.println("Error al cerrar el fichero");
            ex.printStackTrace();
        }
    }
    }
    
    
    
}
