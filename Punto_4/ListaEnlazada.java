package Punto_4;

public class ListaEnlazada {
    Nodo cabeza;
    public ListaEnlazada(){
        this.cabeza = null;
    }
    public void insertar(int valor){
        Nodo nodo = new Nodo();
        nodo.valor = valor;
        nodo.siguiente = cabeza;
        cabeza = nodo;
    }
    public void imprimir(){
        Nodo actual = this.cabeza;
        while (actual != null){
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void InsertarUltimo(int valor){
        Nodo actual = this.cabeza;
        while(actual.siguiente != null){
            actual = actual.siguiente;
        }
        Nodo nodo = new Nodo();
        nodo.valor = valor;
        actual.siguiente = nodo;
    }
    public void InseratarDespues(Nodo despues, int valor){
        Nodo actual = this.cabeza;
        Nodo temp = this.cabeza;
        while (temp.valor != despues.valor){
            temp = actual;
            actual = actual.siguiente;
        }
        Nodo nodo = new Nodo();
        nodo.valor = valor;
        temp.siguiente = nodo;
        nodo.siguiente = actual;


    }


}
