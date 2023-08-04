package CursoAlgoritmosAvanzados;
//Dada una lista de numeros ordenados de menor a mayor con numeros negativos,
//realizar un programa para ordernalos despues de haberlos elevado al cuadrado.
public class CuadradosArregloOrdenado {
    public static void main(String[] args) {
        int[] nums = { -7,-3,2,3,11 };
        int i = 0;
        int tempo;
        for (int j = 0; j < nums.length; j++) {
            nums[j]=nums[j]*nums[j];
        }
        while (i >= 0) {
            if (i<nums.length&&nums[i] > nums[i + 1]) {
                tempo = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = tempo;
                i++;
            }else{i--;}
            
        }
        for (int j : nums) {
            System.out.println(j);
        }
    }
}
