package CursoAlgoritmosAvanzados;
/*
Encontrar todos los anagramas de una cadena
Dadas dos cadenas s y p, devuelva un arreglo con todos los índices de inicio de los anagramas de p en s. Puede devolver la respuesta en cualquier orden.

Un anagrama es una palabra o frase que se forma reordenando las letras de otra palabra o frase, normalmente utilizando todas las letras originales exactamente una vez.

Ejemplo 1:

# Entrada:
	s = "cbaebabacd", p = "abc"
# Salida:
	[0,6]
 */
public class AnagramasCadena {
    public static void main(String[] args) {
        String s = "cbaebabccd";
        String p = "abc";
        //int cont=0;
        //int[] index={0,0};
        /* 
        for (int i = 0; i < s.length(); i++) {
            if(p.charAt(cont)==s.charAt(i)){
                if(cont==0||cont==p.length()-1){
                    index[cont>1?1:0]=i;
                    if(cont==p.length()-1)
                    break;
                }
                cont++;
            }else{
                cont=0;
            }
        }

        if(index[0]>=index[1]){System.out.println("No se encontro la cadena p en la cadena s");
        }else{
        for (int i : index) {
        System.out.print(i+"\t");
        }
        
        System.out.println(s.substring(index[0],index[1]+1));
    }
        */
        int i;
        for (i = 0; i < s.length(); i++) {
            if( i+p.length()<=s.length()&&p.equals(s.substring(i, i+p.length()))){
                    break;
            }
        }
        if(i+p.length()>=s.length()){
            System.out.println("No se encontro el array");
        }else{
            System.out.print(i+"\t"+(i+p.length()-1)+"\t");
            System.out.println(s.substring(i, i+p.length()));
        }
    }
}
