package lecturaescritura;

import java.io.*;

public class MezcladorTextos {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(
                    new FileReader("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Archivo1.txt")
            );
            BufferedReader br2 = new BufferedReader(
                    new FileReader("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Archivo2.txt")
            );
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("F:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Mezcla.txt")
            );
            String linea1 = "";
            String linea2 = "";
            while ((linea1 != null) || (linea2 != null)) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                if (linea1 != null) {
                    bw.write(linea1+"\n");
                }
                if (linea2 != null) {
                    bw.write(linea2+"\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("Archivo Mezcla.txt creado épicamente");
        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}
