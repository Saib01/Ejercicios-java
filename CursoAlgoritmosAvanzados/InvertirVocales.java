package CursoAlgoritmosAvanzados;
/*Dada una cadena de caracteres, invierte solo todas las vocales de la cadena.
Las vocales son ‘a’, ‘e’, ‘i’, ‘o’ y ‘u’, ‘A’, ‘E’, ‘I’, ‘O’, ‘U’. */
public class InvertirVocales {
    public static void main(String[] args) {
    String word="holamuAeendoa";
    String vocales="aeiouAEIOU";
    int [] cont={0,0};
    while(cont[0]+cont[1]<word.length()-1){
        if(vocales.contains(word.substring(cont[0], cont[0]+1))){
            if(vocales.contains(word.substring(word.length()-(1+cont[1]), word.length()-cont[1]))){
                word=word.substring(0, cont[0])+
                word.substring(word.length()-(1+cont[1]), word.length()-cont[1])+//letra
                word.substring(cont[0]+1,word.length()-(cont[1]+1))+
                word.substring(cont[0], cont[0]+1)+//letra
                word.substring( word.length()-cont[1], word.length());
                cont[0]++;
            }
            cont[1]++;
        }else{
            cont[0]++;
        }
    }

        
        System.out.println(word);
    }
    
}
