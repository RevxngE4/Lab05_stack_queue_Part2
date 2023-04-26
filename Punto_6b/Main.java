package Punto_6b;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings to enqueue (press enter to stop):");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            queue.offer(input);
            input = scanner.nextLine();
        }
        int maxLength = 0;
        for (String str : queue) {
            int length = str.length();
            if (length > maxLength) {
                maxLength = length;
            }
        }

        int numShifts = 0;
        while (queue.peek().length() != maxLength) {
            queue.offer(queue.poll());
            numShifts++;
            if (numShifts == queue.size()) {
                // All strings have been checked, but none have the max length
                System.out.println("No string with maximum length found.");
                return;
            }
        }

        System.out.println("Queue with longest string first:");
        for (String str : queue) {
            System.out.println(str);
        }
    }
}