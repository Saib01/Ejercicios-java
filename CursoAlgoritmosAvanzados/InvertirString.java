/* Invertir string
Escribe una función que invierta una cadena. La cadena de entrada se da como un arreglo de caracteres.
Reto: hacerlo modificando la lista de entrada con O(1) de memoria extra.
Ejemplo 1:
# Entrada:
	s = ["h", "e", "l", "l", "o"]
# Salida:
	["o","l","l","e","h"]

Ejemplo 2:
# Entrada:
	s = ["H", "a", "n", "n", "a", "h"]
# Salida:
	["h","a","n","n","a","H"]
 */
package CursoAlgoritmosAvanzados;
public class InvertirString {
    public static void main(String[] args) {
        String[] string={"1", "2", "3","4","5","6", "7", "8","9"};
    
        String stringTemp;
        for (int i = 0; i < string.length/2; i++) {
            stringTemp=string[i];
            string[i]=string[string.length-1-i];
            string[string.length-1-i]=stringTemp;
        }
        for (String string2 : string) {
            System.out.println(string2);
        }
        //Forma 2
    }
}
