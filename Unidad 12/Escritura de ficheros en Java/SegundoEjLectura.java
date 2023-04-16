package lecturaescritura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de uso de la clase File Lectura de un fichero de texto
 *
 * @author El Sopas
 */
public class SegundoEjLectura {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Frutas.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero Secretos.txt");
        } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero Secretos.txt");
        }
    }
}