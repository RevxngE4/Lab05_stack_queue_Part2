package Punto_4b;

public class ListaDobleEnlazada {
    Nodo cabeza;
    Nodo cola;
    public ListaDobleEnlazada(){
        this.cabeza = null;
        this.cola = null;
    }
    public void inserta(int valor){
        Nodo nodo = new Nodo(valor);
        if (this.cabeza == null){
            this.cabeza = nodo;
            this.cola = nodo;
        } else {
            nodo.anterior = this.cola;
            this.cola.siguiente = nodo;
            this.cola = nodo;
        }
    }
    public void imprimir (){
        Nodo actual = this.cabeza;
        while (actual != null){
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void eliminar(int valor) {
        Nodo actual = this.cabeza;
        while(actual != null){
            if (actual.valor == valor){
                if (actual == this.cabeza){
                    this.cabeza = actual.siguiente;
                    if (this.cabeza !=null){
                        this.cabeza.anterior=null;
                    }else {
                        this.cola = null;
                    }
                } else if (actual == this.cola){
                    this.cola = actual.anterior;
                    this.cola.siguiente = null;
                }else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }
}
