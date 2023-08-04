package EstructuraDatosLineales;

import java.util.List;

class ListaEnlazada{
    public Nodo cabeza;
    public Nodo cola;
    public ListaEnlazada(Nodo primerNodo){
        cabeza = primerNodo;
        cola = primerNodo;
    }
    public ListaEnlazada(Nodo primerNodo,Nodo ultimoNodo){
        cabeza = primerNodo;
        cola = ultimoNodo;
    }
    public void insertarNodoAlFinal(Nodo nuevoNodo){
        cola.siguiente = nuevoNodo;
        cola = cola.siguiente;
    }
    public void borrarNodo(Nodo nodo){
        nodo.siguiente = null;
    }
    public Nodo buscarNodo(int valorABuscar){
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.valor == valorABuscar){
                return nodoActual;
            }
            nodoActual = nodoActual.siguiente;
        }
        return null;
    }
    public void borrarNodoPorValor(int valor){
        Nodo nodoABorrar = buscarNodo(valor);
        if (nodoABorrar != null) {
            nodoABorrar.siguiente = null;
        }
    }

    public void invertirListaEnlazada( List<Nodo> nodo){
        cola = this.cabeza;
        Nodo nodoAnterior = null;
        Nodo nodoSiguiente;
        while(cabeza!=null){
                nodoSiguiente=cabeza.siguiente;
                cabeza.siguiente=nodoAnterior;
                nodoAnterior=this.cabeza;
                this.cabeza=nodoSiguiente;
                /*
                Nodo 1->Nodo2->Nodo3->Null
                paso 1
                Nodo1->null
                Nodo2->Nodo3->Null
                paso 2
                Nodo2->Nodo1->null
                Nodo3->Null
                paso 3
                Nodo3->Nodo2->Nodo1->null
                 */
        }
        this.cabeza=nodoAnterior;
        System.out.println("");
    }
}