package Punto_5;

import java.util.NoSuchElementException;

public class MiPila {
    private int[] array;
    private int top;

    public MiPila() {
        array = new int[1000000];
    }

    public void push(int value) {
        if (top == 999999) {
            throw new IllegalStateException("La pila está llena");
        }
        top++;
        array[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        int value = array[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 999999;
    }
}
