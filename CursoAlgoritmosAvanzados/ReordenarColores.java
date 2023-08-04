/*Dado un arreglo nums con n objetos de color rojo, blanco o azul, ordénalos en su lugar para que los objetos del mismo color sean adyacentes, con los colores en el orden rojo, blanco y azul.

Utilizaremos los enteros 0, 1 y 2 para representar el color rojo, blanco y azul, respectivamente.

Reto 1: debes resolver este problema sin utilizar la función de ordenación de la biblioteca.

Reto 2: ¿podrías idear un algoritmo de una sola pasada utilizando solo un espacio extra constante? */
package CursoAlgoritmosAvanzados;

public class ReordenarColores {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 1, 1, 0 };
        int i = nums.length - 1;
        while (i >=0) {
            if(i>0&&
            nums[i]==0&&
            nums[i-1]!=0){
                nums[i]=nums[i-1];
                nums[i-1]=0;
            }
            if(i!=nums.length - 1&&nums[i]==2&&
            nums[i+1]!=2){
                nums[i]=nums[i+1];
                nums[i+1]=2;
                i=(i==nums.length - 2)?--i:++i;
            }else{
                i--;}
            
        }
    }
}
