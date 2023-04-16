package lecturaescritura;

import java.io.*;
public class EscrituraAsignaturas {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\Asignaturas.txt"));
            //No añade, pisa el fichero con los datos que se metan sii se ejecuta de nuevo
            bw.write("Bases de Datos\n");
            bw.write("Sistemas Informáticos\n");
            bw.write("Programación Java\n");
            bw.write("Entornos de Desarrollo\n");
            bw.write("El Fol\n");
            bw.write("Lenguaje de Marcas\n");

            System.out.println("Fichero maldito creado");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
