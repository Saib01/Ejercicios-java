/*
Merge Two Sorted Lists: análisis del problema

Dadas dos listas de numeros enteros nums1 y nums2, cada una ordenada en orden ascendente, y dos enteros m y n, que representan la cantidad de elementos en nums1 y nums2 respectivamente.

Combinar nums1 y nums2 en un unico array ordenado de forma ascendente.

Para ello,nums1 tiene una longitud de m+n, donde los primeros m elementos denotan los elementos que deben ser combinados, y los últimos n elementos son 0 y deben ser ignorados.

Ejemplo1:

nums1=[1,2,3,0,0,0] 			nums2=[2,5,6]
m=3					n=3

Resultado [1,2,2,3,5,6]

Ejemplo2:
nums1=[1, 3, 5, 7, 0, 0, 0] 		nums2=[2,4,6]
m=4					n=3

Resultado [1, 2, 3, 4, 5, 6, 7]
 */
package CursoAlgoritmosAvanzados;
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[]nums1={2,3, 5, 7,0,0,0,0,0,0};int[] nums2={1,1,2,2,4,6};
        int m=4;int n=6;
        int []index={m-1,n-1};
        for (int i = nums1.length-1; i >=0; i--) {
            //index[0]<0 indica que se han terminado los valores del array 1
            //index[1]>=0 Todavia quedan valores del array 2
            //nums2[index[1]]>=nums1[index[0]] Comparacion
            if(index[0]<0||index[1]>=0&&nums2[index[1]]>=nums1[index[0]]){
                nums1[i]=nums2[index[1]--];
            }else{
                nums1[i]=nums1[index[0]--];
            }
        }
        System.out.print("nums1=[");
        for (int i = 0; i < nums1.length-1; i++) {System.out.print(nums1[i]+",");}
        System.out.print(nums1[nums1.length-1]+"]");
    }
}
