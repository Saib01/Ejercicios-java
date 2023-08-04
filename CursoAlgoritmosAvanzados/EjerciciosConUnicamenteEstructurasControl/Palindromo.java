package CursoAlgoritmosAvanzados.EjerciciosConUnicamenteEstructurasControl;

public class Palindromo {
    public static void main(String[] args) {
        String word="ana";
        System.out.println(isPalindromo(word));
        System.out.println(isPalindromoMethod2(word));
    }
    //Verificando las letras 
    public static boolean isPalindromo(String word){
        int i=0;
        //Cuando la longitud de la palabra es impar como por ejemplo ana, no se compara la n pero si las dos a del inicio y el final.
        for (i = 0; i < word.length()/2; i++) {
            if(word.charAt(i)!=
            word.charAt(word.length()-1-i)
            ){
                break;
            }
        }
        return i>=word.length()/2;
    }
    //Invertiendo el string y comparando cadenas 
    public static boolean isPalindromoMethod2(String word){
        int i=0;
        StringBuilder word2=new StringBuilder();
        for (i = 0; i < word.length(); i++) {
            word2.append(word.charAt(word.length()-(1+i)));
        }
        return word.equals(word2.toString());
    }
}
