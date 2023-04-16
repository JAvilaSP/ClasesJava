package lecturaescritura;

import java.io.*;

/**
* Ejemplo de escritura de un fichero de texto
* @author El Sopas
 */

public class CreaPares {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\pares.txt"));
            int count = 0;
            for (int i = 2; i <= 100; i+= 2) {
                bw.write(Integer.toString(i)+"\n");
                count++;
            }
            bw.close();
            System.out.println("Se ha creado el fichero 'pares.txt'");
            System.out.println("Se ha guardado "+count+" números pares");
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el ficherón");
        }
    }
}
