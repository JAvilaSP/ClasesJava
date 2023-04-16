package lecturaescritura;

import java.io.*;

public class PrimerEjEscritura {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Sopas.txt"));
            //No añade, pisa el fichero con los datos que se metan sii se ejecuta de nuevo
            bw.write("De Pollo\n");
            bw.write("De Mariscón\n");
            bw.write("De Naranja\n");
            bw.write("De la abuelita\n");
            System.out.println("Fichero creado");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Sopas.txt"));
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
