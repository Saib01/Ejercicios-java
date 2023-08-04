package EstructuraDatosLineales;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Nodo> nodo = new ArrayList<Nodo>();
        int numsNodo = 6;
        nodo.add(new Nodo(numsNodo));
        for (int i = numsNodo - 1; i > 0; i--) { // Corregir el bucle cambiando i++ por i--
            nodo.add(new Nodo(i, nodo.get(numsNodo - (i + 1))));
        }
        ListaEnlazada listaEnlazada = new ListaEnlazada(nodo.get(numsNodo - 1),nodo.get(0));
        listaEnlazada.invertirListaEnlazada(nodo);
    }
}
