package lecturaescritura;

import java.io.*;

public class CreaCarpetas {
    public static void main(String[] args) {

        String ruta = "D:\\1ano3trimestre\\";
        String carpeta = "Programacion";
        String archivo = "archivo.txt";
        File fichero = new File(ruta+carpeta);
        File texto = new File(ruta+archivo);

        try {

            if (fichero.exists()) {
                System.out.println("Illo que la carpeta ya existe");
                if (texto.exists()) {
                    System.out.println("Y el texto tambien.");
                    texto.delete();
                    System.out.println("texto borrado");
                } else {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(ruta+archivo));
                    bw.write("Me duele todo.");
                    bw.close();
                    System.out.println("Texto creado");
                }
            } else {
                fichero.mkdir();
                System.out.println("Carpeta creada.");
            }
        } catch (IOException ioe) {
            System.out.println("Problema en la creación de archivos.");
        }
    }
}
