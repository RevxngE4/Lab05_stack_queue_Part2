package Punto_5_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("src\\archivo.txt");
        try (Scanner scanner = new Scanner(archivo)) {
            MiPilaConMinimo pila = new MiPilaConMinimo();
            int longitudMasCorta = Integer.MAX_VALUE;
            int numeroLineaMasCorta = 0;
            int numeroLinea = 0;
            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                int longitud = linea.length();
                pila.push(longitud);
                if (longitud < longitudMasCorta) {
                    longitudMasCorta = longitud;
                    numeroLineaMasCorta = numeroLinea;
                }
                numeroLinea++;
            }
            System.out.println("Contenido de la pila:");
            while (!pila.isEmpty()) {
                System.out.println(pila.pop());
            }
            System.out.println("Número y longitud de la línea más corta:");
            System.out.println(numeroLineaMasCorta + 1 + " " + longitudMasCorta);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

