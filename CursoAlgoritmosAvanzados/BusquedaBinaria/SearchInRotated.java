package CursoAlgoritmosAvanzados.BusquedaBinaria;

/*Tienes una lista de enteros ordenada de forma ascendente con valores distintos.
La lista(nums) se encuentra posiblemente rotada en un indice pivote desconecido k(1<=k<nums.lenght) de tal manera que el array resultante es [nums[k],nums[k+1]....,nums[n-1],nums[0],nums[1],....,nums[k+1]]

Ejemplo:{0,1,2,3,4,5,6,7} podria girar en el indice pivote 3 y convertirse en {4,5,6,7,0,1,2}.

Dado en array nums despues de la posible rotacion y un objetivo entero, devuelve el indice del objetivo si esta en nums o -1 si no esta en nums.
 */
public class SearchInRotated {
    public static void main(String[] args) {
        // Funcion para crear un array rotado
        int[] nums = new int[39];
        int k = 0;// pivote de rotacion positivo
        for (int i = 0; i < 39; i++) {
            if (nums.length -  k > i) {
                nums[i] = i + (k);
            }else{
                nums[i] = i - (nums.length - (k));
            }

        }
        // Ejercicios realizado
        for (int numToFind = 0; numToFind < nums.length; numToFind++) {
        int index[] ={-(nums[0]),nums.length+(-(nums[0]))-1};
        boolean notFind = true;
        int medium = 0;
        while (notFind) {
            medium = (index[1]+index[0]);
            medium=(((medium//Sumatoria de index 1 y 2
            +(medium/Math.absExact(medium!=0?medium:1))//Un uno que tiene signo positivo o negativo dependiendo de la sumatoria anterior, este uno se pierde en la division cuando el numero es par debido a que 0.5 convertido a int da un 0.
            )/2)//division para sacar la mitad del index
            +nums.length)%nums.length;//Devuelve el restante de la suma es decir que (-7+39)/39 devuleve 32 Con esto convertimos a un indice positivo que el compilador pueda ejecutar
            if (nums[medium] == numToFind) {
                notFind = false;
            }
            if (nums[medium] > numToFind) {
                index[1] = (index[0]+index[1])/2;
            }
            if (nums[medium] < numToFind) {
                index[0] = (index[0]+index[1])/2;
            } 
        }
        System.out.println(nums[medium]);
    }
        
    }
}
