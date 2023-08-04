package CursoAlgoritmosAvanzados;

import java.util.Arrays;
//Contar cuantas veces se repite un caracter
public class ContCharacter {
    public static void main(String[] args) {
        String text = "asdcasdacsdcasdas";
        int cont = text.length(); // La variable cont es efectivamente final

        for (String string : Arrays.asList(text.split("a"))) {
            cont-=string.length();
        }

        System.out.println("Hay " + cont+" caracteres");
        //Solucion 2
        Long n=text.chars().filter(x->x=='a').count();
        System.out.println("Hay " + n+" caracteres");
    }
}





