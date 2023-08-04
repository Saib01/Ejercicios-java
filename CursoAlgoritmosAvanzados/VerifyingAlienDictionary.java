
/*En una lenguaje alienigena,sorprendentemente,
tambien utilizan las letras del español,pero posiblemente en un 
orden diferente, una permutación de nuestro alfabeto.
Dada una secuencia de palabras escribas en el idioma
extranjero, y el orden del alfabeto, devuelve verdadero
si y solo si las palabras dadas estan ordenadas
lexicograficamente en este idioma extranjero

palabras = ["conocer","cono"];
ordenAlfabeto="abcdefghijklmnoprstuvwxyz" ----> False

palabras = ["habito","hacer","lectura","sonreir"]
ordenAlfabeto="habcdefgijklmnoprstuvwxyz" ----> True

*/

package CursoAlgoritmosAvanzados;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class VerifyingAlienDictionary {
    public static void main(String[] args) {

        // Obtener el objeto Runtime
        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        long startTime = System.nanoTime();
        String[] palabras = { "conocer", "cono", "defi", "alfredo" };
        String ordenAlfabeto = "abcdefghijklmnoprstuvwxyz";
        List<String> list = palabraInicialYFinal(palabras, ordenAlfabeto);
        System.out.println(list.equals(Arrays.asList("alfredo", "conocer", "cono", "defi")));
        // Código que deseas medir

        // Obtener el uso de memoria después de la sección de código
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Calcular la diferencia de uso de memoria
        long memoryUsed = memoryAfter - memoryBefore;
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double microseconds = (double) duration / 1000.0;
        System.out.println("Tiempo de ejecución: " + microseconds + " microsegundos");
        System.out.println("Espacio de memoria utilizado: " + memoryUsed + " bytes");
    }

    public static List<String> palabraInicialYFinal(String[] palabras, String ordenAlfabeto) {
        ArrayList<String> palabrasRetorno = new ArrayList<>();
        List<String> listaPalabras = new ArrayList<>(Arrays.asList(palabras));

        while (listaPalabras.size() != 1) {
            int i = 0;
            int menor = 1000;
            int comp = 0;
            int cont = 0;
            int index = 0;
            ArrayList<Integer> indexAnt = new ArrayList<Integer>();
            ArrayList<Integer> posme = new ArrayList<Integer>();

            for (String palabra : listaPalabras) {
                index = ordenAlfabeto.indexOf(palabra.charAt(i));
                indexAnt.add(index);
                menor = Math.min(menor, index);
                posme.add(cont++);
            }

            comp = menor;
            cont = 0;
            i = 1;

            while (posme.size() != 1) {
                int j = 0;
                menor = 1000;

                while (j < posme.size()) {
                    if (i > listaPalabras.get(j).length() || comp < indexAnt.get(j)) {
                        posme.remove(j);
                        indexAnt.remove(j);
                        cont += 1;
                    } else {
                        index = listaPalabras.get(j).length() != i
                                ? ordenAlfabeto.indexOf(listaPalabras.get(j).charAt(i))
                                : index;
                        menor = Math.min(menor, index);
                        indexAnt.set(j, index);
                        ++j;
                    }
                }
                comp = menor;
                ++i;
            }
            palabrasRetorno.add(listaPalabras.get(posme.get(0)));
            listaPalabras.remove(palabrasRetorno.get(palabrasRetorno.size() - 1));
        }
        palabrasRetorno.add(listaPalabras.get(0));
        for (String string : palabrasRetorno) {
            System.out.println(string);
        }
        return palabrasRetorno;
    }

    // ChatGPT
    public static List<String> palabraInicialYFinal2(String[] palabras, String ordenAlfabeto) {
        List<String> palabrasRetorno = Arrays.asList(palabras);
        palabrasRetorno.sort(Comparator.comparingInt(p -> ordenAlfabeto.indexOf(p.charAt(0))));
        palabrasRetorno.forEach(System.out::println);
        return palabrasRetorno;
    }

}