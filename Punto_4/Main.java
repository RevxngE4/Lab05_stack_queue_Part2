package Punto_4;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada linkedList = new ListaEnlazada();
        linkedList.insertar(1);
        linkedList.insertar(8);
        linkedList.insertar(5);

        linkedList.InsertarUltimo(3);
        Nodo nodo = new Nodo();
        nodo.valor = 1;
        linkedList.InseratarDespues(nodo, 10);
        linkedList.imprimir();

    }
}
