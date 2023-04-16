package lecturaescritura;

import java.io.*;
import java.util.Scanner;
public class CreaCarpetas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cuenta=0;
        String input1;
        String ruta = "D:\\1ano3trimestre\\tercertrimestre1\\src\\lecturaescritura\\";
        do {

            System.out.println("| Elija su opción preferida: \n" +
                    "|   'c' = crear carpetas    |\n" +
                    "|   'd' = eliminar carpetas |\n" +
                    "|   'q' salir del programa  |\n");
            input1 = s.next();
            if (input1.equals("c")) {
                System.out.print("Introduzca el nombre deseado de su carpeta: ");
                String nombreCarp = s.next();
                File carp = new File(ruta + nombreCarp);
                if (carp.exists()) {
                    System.out.println("Esa carpeta ya existe, inutil.");
                } else {
                    carp.mkdir();
                    System.out.println("Carpeta creada satisfactoriamente.");
                }
            } else if (input1.equals("d")) {
                System.out.print("Introduzca el nombre de la carpeta a eliminar: ");
                String nombreCarp = s.next();
                File carp = new File(ruta+nombreCarp);
                if (carp.exists()) {
                    carp.delete();
                    System.out.println("Carpeta eliminada satisfactoriamente.");
                } else {
                    System.out.println("No se puede encontrar esta carpeta.");
                }
            } else if (input1.equals("q")){
                System.out.println("Hasta luegui!");
                //break;        #Se comenta porque no estoy seguro de si es necesario o no.
            } else {
                System.out.println("mi no entender.");
                if (cuenta>=0) {
                    System.out.println("Ha introducido un valor incorrecto "+(cuenta+2)+" veces.");
                    if (cuenta==3) {
                        System.out.println("Saliendo del programa...");
                        break;
                    } else if (cuenta <3) {
                        System.out.println("Si introduce un valor incorrecto "+(3-cuenta)+" veces más, se saldrá del" +
                                "programa");
                    }
                }
                cuenta++;
            }

        } while (!input1.equals("q"));
    }
}
