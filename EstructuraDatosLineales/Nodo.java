package EstructuraDatosLineales;

public class Nodo {
        int valor;
        Nodo siguiente;
        Nodo() {}
        Nodo(int valor) { this.valor = valor; }
        Nodo(int valor, Nodo siguiente) { this.valor = valor; this.siguiente = siguiente;  }
}
