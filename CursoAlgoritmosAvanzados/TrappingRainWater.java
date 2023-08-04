package CursoAlgoritmosAvanzados;

/*
 * Trapping Rain Water

Dada una lista de numeros que representan un grupo de lineas de diferentes alturas.
Calcula cuanta agua puede atrabar despues de llover.

 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,1,1,0};//{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int maxValue=0;
        int[] cont={0,0,0};
        //[0]->Contador de cuadro de agua con columna izquierda
        //[1]->Contador de cuadro de agua con ambas columnas
        //[2]->Contador de nivel de agua de 1 cuadro de agua a maxValue
        boolean cond=false;
        while (cont[2] <=maxValue) {
            int Ant=0;
            cont[2]++;
            for (int i = 0; i < heights.length; i++) {
                if(heights[i]>=cont[2]){
                    cond=cond&&Ant<cont[2]?false:true;
                    //cond->True indica la activacion del cont[0]
                    //Ant<cont[2] Si se vuelve a entrar en la funcion y el nivel anterior del bloque era inferior al nivel de conteo se guarda
                    //            De lo contrario deja la condicion activa de cont[0]
                    if(cond==false){
                        cont[1]+=cont[0];
                        cont[0]=0;
                    }
                }else if(heights[i]<cont[2]&&cond==true){
                    cont[0]++;
                }
                Ant=heights[i];
                if(cont[2]==1&&maxValue<=heights[i]){maxValue=heights[i];}
            }
        }
    System.out.println(cont[1]);
    }
}
