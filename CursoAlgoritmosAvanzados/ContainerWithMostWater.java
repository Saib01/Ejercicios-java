package CursoAlgoritmosAvanzados;
/*
Container With Most Water: análisis del problema

Dada una lista de numeros que representan un grupo de lineas de diferentes alturas.
Encuentre dos lineas que formen un contenedor, tal que este contenga la mayor cantidad de agua.

Devuelve la cantidad maxima de agua que puede almacenar un contenedor.

alturas=[1,8,6,2,5,4,8,3,7] 
Resultado=[49]
 * 
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights={10,8,6,2,5,4,8,3,7};
        int[][] maxWithIndex = new int[2][heights.length+1];
        int currentArea;
        for (int i = 0; i <heights.length; i++) {
            maxWithIndex[0][i]=0;
            for (int j = i+1; j < heights.length; j++) {
                currentArea=(j-i)*Math.min(heights[i],heights[j]);
                if(currentArea>=maxWithIndex[0][i]){
                    maxWithIndex[0][i]=currentArea;
                    maxWithIndex[1][i]=j;
                }
            }
            if(i!=0&&maxWithIndex[0][i]>=maxWithIndex[0][heights.length]){
                maxWithIndex[0][heights.length]=maxWithIndex[0][i];
                maxWithIndex[1][heights.length]=i;
            }
        }
        System.out.println("maxArea= "+maxWithIndex[0][heights.length]+
        " height 1="+heights[maxWithIndex[1][heights.length]]+
        " height 2="+heights[maxWithIndex[1][maxWithIndex[1][heights.length]]]+"");
    }
}
