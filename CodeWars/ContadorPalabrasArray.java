package CodeWars;
/*

Dada una palabra, buscarla en una frase y devolver cuantas veces aparece La frase y la palabra deben ser parametros de una función.
Como hacerlo:
-Funcion con dos parametros "frase" y "busqueda".
-Poner un string en minusculas y limpiarlo
-Comprobar si la busqueda es incluida en la frase
-crear un array de palabras de la frase
-Mapear esas palabras y hacer un contador de cada una
-devolver el contador de la busqueda
*/
public class ContadorPalabrasArray {
    public static void main(String[] args) {
        System.out.println(contfrase("123",""));
    }
    public static int contfrase(String frase,String busqueda){
        if (busqueda.length()==0) {
            throw new RuntimeException("El contenido a buscar es una cadena vacia.");
        }
        String separacion=frase.replaceAll(busqueda,"");
        return (frase.length()-separacion.length())/busqueda.length();
    }
}
