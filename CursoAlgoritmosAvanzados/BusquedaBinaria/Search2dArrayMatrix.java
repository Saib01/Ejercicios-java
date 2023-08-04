package CursoAlgoritmosAvanzados.BusquedaBinaria;
/*Escriba un codigo eficiente que busque un valor objetivo en una matriz de m x n enteros.
    Esta matriz tiene las siguientes propiedades:
    Los enteros de cada fila estan ordenados de izquierda a derecha.
    el primer enetero de cada fila es mayor que el ultimo entero de la fila anterior
 */
public class Search2dArrayMatrix {
    public static void main(String[] args) {
        // Crear y rellenar la matriz 
                int filas = 1000;
        int columnas = 1000;
        Integer[][] matrizValores = new Integer[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizValores[i][j] = j + i * 1000; // Rellenar con valores aleatorios hasta 999
            }
        }
        //Ejercicio
        int target = 800000;
        boolean notFind = true;

        int[] index = { 0, matrizValores[matrizValores.length - 1].length - 1, matrizValores.length - 1 };
        int medium = 0;
        while (notFind) {
            // Calculo de fila
            if (matrizValores[index[2]][index[0]] <= target) {
                // Calculo columna
                medium = (index[0] + index[1]) / 2;
                if (matrizValores[index[2]][medium] < target) {
                    index[0] = medium;
                }
                if (matrizValores[index[2]][medium] > target) {
                    index[1] = medium;
                }
                if (matrizValores[index[2]][medium] == target) {
                    notFind = false;
                }
            } else {
                if (matrizValores[(index[2]+medium+1)/2][0] <= target) {
                    medium=(index[2]+medium)/2;
                }
                if (matrizValores[(index[2]+medium+1)/2][0]>=target) {
                    index[2] =(index[2]+medium)/2;
                }
            }

        }
        //Resultado
        
        System.out.print("Se encontre el numero "+ matrizValores[index[2]][medium]+" Resultado=");
        System.out.println(matrizValores[index[2]][medium]==target);
        System.out.println("En la posicion: ["+index[2]+"] ["+medium+"]");
    }
}
