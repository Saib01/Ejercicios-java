package PruebasPragma;

import java.util.Random;
/*Given a string that consists of left and right parentheses, '(' and ')' , balance the parentheses by
inserting parentheses as necessary. Determine the minimum number of characters that must be inserted.
Example
s = '(()))'
Insert 1 left parenthesis at the left end of the string to get '((()))'. The string is balanced after 1 insertion.
s = '))(('
Insert 2 left parentheses at the start and 2 right parentheses at the end of the string to get '(())(())' after 4
insertions.
Constraints
1 ≤ length of s ≤ 10^5 */
public class Parentesis {
    public static void main(String[] args) throws Exception {
        //Generador de parentesis
        StringBuilder combinacion = new StringBuilder();
        int numeroRepeticiones = 100000; // Número de veces que se repetirá la combinación
        Random random = new Random();
        for (int i = 0; i < numeroRepeticiones; i++) {
            int aleatorio = random.nextInt(2) + 1; // Genera un número aleatorio entre 1 y 2

            if (aleatorio == 1) {
                combinacion.append("(");
            } else {
                combinacion.append(")");
            }
        }
        
        String c = combinacion.toString();//")))(()()(()))))))))))))))))()))))))()))))))))))))))))))))()))())())())())))()))()))()())))))())))))))((((()()())())))))))))))))))))))())()))())())))()()))))()))))))()))))))()(())))))())))))))))))))))))()))))))(())))())))))))))))())))))))))))))))))())))))(()))))))))))()))))))))())))(()))())))())()))())))))()))())))()))))))))))))))))()))))))))())))))(())()(()))))))))))(()))))))))))))))))))))))()))))))))()))))))))))))))))))))()))())())))())))(()(())))))()())))())))))))))))))))())))))()((())))())(()))))((())))))))))()))))))())))))))))))))()()))(())))))))))))()))))())))))))(()))))))))())))))))))())))))))())))))()))))))))))()())))))))())))))))))))))))())))))())))))))))))))()))()))))()())))))))))())())))()))))())))(())))))))))))))))))))))())()))))))))))))))))()))())))())))(())))))((()))))))))()))))))))))()))))))))()))()))))))())))())(()))))((())))))))()())))))))))()))))))))))))))))()))())))()))))))())))))))))))))())))))))))))()))))()))())))))(()))()))))))))())))))())))))))()()))))))))))))()))";
        //Codigo 1
        StringBuilder c1 = new StringBuilder(c);
        char c_actual, c_anterior;
        for (int i = 1; i < c1.length(); i++) {
            if(i>0){
            c_anterior = c1.charAt(i - 1);
            c_actual = c1.charAt(i);
            if (c_actual == ')' && c_anterior == '(') {
                c1.deleteCharAt(i);
                c1.deleteCharAt(i - 1);
                i--;
                i--;
            }
        }
        }
        //System.out.println(c1);
        System.out.print("Se necesita un total de:" + c1.length());
        System.out.print("\t"+getMin(c));
        System.out.println("\t"+getMin2(c));
    }
    //Codigo 2
    public static int getMin(String s) {
        int izq = 0, der = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (izq == 0) {
                    der = der + 1;
                } else {
                    izq = izq - 1;
                }
            } else if (s.charAt(i) == '(') {
                izq = izq + 1;
            }
        }
        int result = izq + der;
        return result;
    }
    //Codigo 3 solucion dada por pragma
    public static int getMin2(String s) {
        int bal=0;
        int ans=0;
        for (int i = 0;i < s.length(); i++) {
            if(s.charAt(i) == '('){
                bal+=1;
            }else{
                bal-=1;
            }
            if(bal==-1){
                ans+=1;
                bal+=1;
            }
        }  
        return bal+ans;
    }
}
