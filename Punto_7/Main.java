package Punto_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dec dec = new Dec();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter commands (press enter to stop):");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 65 && c <= 90) { // Uppercase letter
                    dec.addFront(String.valueOf(c));
                } else if (c >= 97 && c <= 122) { // Lowercase letter
                    dec.addRear(String.valueOf(c));
                } else if (c == '+') {
                    String data = dec.removeFront();
                    if (data != null) {
                        System.out.println(data);
                    }
                } else if (c == '*') {
                    String data = dec.removeRear();
                    if (data != null) {
                        System.out.println(data);
                    }
                }
            }
            input = scanner.nextLine();
        }
    }

}
