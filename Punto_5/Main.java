package Punto_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiPila pila = new MiPila();
        while (scanner.hasNext()) {
            String linea = scanner.nextLine();
            if (linea.equals("+")) {
                int valor = scanner.nextInt();
                pila.push(valor);
            } else if (linea.equals("-")) {
                System.out.println(pila.pop());
            }
        }
    }
}
