package Punto_4b;

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada listaDobleEnlazada = new ListaDobleEnlazada();
        listaDobleEnlazada.inserta(1);
        listaDobleEnlazada.inserta(2);
        listaDobleEnlazada.inserta(3);
        listaDobleEnlazada.inserta(9);
        listaDobleEnlazada.inserta(2);
        listaDobleEnlazada.eliminar(3);
        listaDobleEnlazada.imprimir();
    }
}
