package CursoAlgoritmosAvanzados;

/*Dada una cadena de caracteres,averigua si la cadena dada es un palíndromo o no. Puedes eliminar un carácter de la cadena.
   Una cadena es un palíndromo si se lee igual 
   hacia adelante y hacia atrás. 
   Ejemplo 1:

# Entrada:
	s = "aba"
# Salida:
	true
   
   */
public class PalindronomoConReemplazo {
    public static void main(String[] args) {
        String s = "abca";
        int i = 0;
        int cont = 0;
        while (s.length() / 2 > i) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                cont++;
            }
            i++;
        }
        System.out.println(cont <= 1 ? "True" : "False");
    }
}
