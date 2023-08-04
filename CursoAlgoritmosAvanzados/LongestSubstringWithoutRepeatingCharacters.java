package CursoAlgoritmosAvanzados;

public class LongestSubstringWithoutRepeatingCharacters {
    //Dada una cadena s,encontrar la longitud de la subcadena más larga sin repetir caracteres
    public static void main(String[] args) {
        String s =// "jdkafnlcdsalkxcmpoiuytfccv";//15
        "abcabcbb";//3
        int cont = 0;
        int pos = 0;
        for (int i = 1; i < s.length(); i++) {
            String temp = s.substring(pos, i);
            if (cont <=i - pos) {
                    cont=i - pos;
            }
            if(temp.contains(s.substring(i,i+1))==true){
                pos = i;
            }
        }
        System.out.println("Longitud de la Cadena mas larga= " + cont);
    }
}
