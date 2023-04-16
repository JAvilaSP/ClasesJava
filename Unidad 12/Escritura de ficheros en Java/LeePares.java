package lecturaescritura;

import java.io.*;

public class LeePares {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\pares.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero pares.txt");
        }
    }
}
