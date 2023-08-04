/*
 * Mover ceros al final
Dada la lista de enteros nums, mueve todos los ceros al final de la misma, manteniendo el orden relativo de los elementos no nulos.
Reto: reordena los valores “in place”, sin hacer una copia de la lista.
Ejemplo 1:
# Entrada:
	nums = [0,1,0,3,12]
# Salida:
	[1,3,12,0,0]

Ejemplo 2:
# Entrada:
	nums = [0]
# Salida:
	[0]

 */

package CursoAlgoritmosAvanzados;

public class MoverCerosAlFinal {
    public static void main(String[] args) {
        int[] nums={0};
        int cont=0;
        int i = nums.length-1;
        while(i>=0){
            if(nums[i]==0){
                if(i==nums.length-1-cont){
                    cont++;
                    i-=2;
                }else{
                    nums[i]=nums[i+1];
                    nums[1+i++]=0;
                }
            }else{
                i--;
            }
        }
        for (int j : nums) {
            System.out.println(j);
        }
    }
}
