package Punto_5_2;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MiPilaConMinimo {
    private Stack<Integer> valores;
    private Stack<Integer> minimos;

    public MiPilaConMinimo() {
        valores = new Stack<>();
        minimos = new Stack<>();
    }

    public void push(int valor) {
        valores.push(valor);
        if (minimos.isEmpty() || valor <= minimos.peek()) {
            minimos.push(valor);
        }
    }

    public int pop() {
        if (valores.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        int valor = valores.pop();
        if (valor == minimos.peek()) {
            minimos.pop();
        }
        return valor;
    }

    public int min() {
        if (minimos.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return minimos.peek();
    }

    public boolean isEmpty() {
        return valores.isEmpty();
    }
}
