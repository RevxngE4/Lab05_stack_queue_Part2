package Punto_7;

public class Dec {
    private class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public Dec() {
        front = null;
        rear = null;
        size = 0;
    }

    public void addFront(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public String removeFront() {
        if (isEmpty()) {
            return null;
        }
        String data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        return data;
    }

    public String removeRear() {
        if (isEmpty()) {
            return null;
        }
        String data = rear.data;
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        size--;
        return data;
    }

    public String peekFront() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    public String peekRear() {
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
