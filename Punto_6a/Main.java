package Punto_6a;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena de comandos: ");
        String input = scanner.nextLine();

        String[] commands = input.split(" ");
        for (String command : commands) {
            if (command.matches("[A-Z]+")) { // si es una letra mayúscula
                queue.add(command);
            } else if (command.equals("*")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
            }
        }
    }
}
