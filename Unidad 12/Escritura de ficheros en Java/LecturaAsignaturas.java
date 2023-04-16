package lecturaescritura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaAsignaturas {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Asignaturas.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException ioe) {
            System.out.println("No se puede leer el fichero");
        }
    }
}
