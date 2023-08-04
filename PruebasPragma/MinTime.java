package PruebasPragma;
/*An e-commerce website uses a robot for its shipping process. There is a row of bins, where each bin
contains a certain number of packages, and a robot stands at the end of the row. The robot can move to
any bin and back again, picking up a maximum of 1 package from each bin along the way, which are then
shipped. Moving the distance of 1 bin and back requires 1 unit of time. Also, the process of loading and
unloading 1 package requires 1 unit of time. Given the number of bins and how many packages are in
each one, what is the minimum amount of time the robot needs to remove all the packages from the bins?
For example, let's say there are n = 3 bins, where packages = [1, 2, 3]. This means that the first bin has 1
package in it, the second has 2, and the third has 3, with the robot standing near the last bin. The optimal
movement for the robot is as follows:
1. Move to the third bin, retrieve 1 package, then move back to its position. This requires 2 units of time
(1 to move to the bin and back, and 1 to load and unload the 1 package).
2. Move to the second bin, retrieving 1 package from the third bin and 1 package from the second bin,
then move back to its position. This requires 4 units of time (2 to move to the bin and back since it's 2
bins away, and 2 to load and unload the 2 packages).
3. Move to the first bin, retrieving 1 package each from each of the three bins, the move back to its
position. This requires 6 units of time (3 to move to the bin and back since it's 3 bins away, and 3 to
load and unload the 3 packages).
Following this procedure, the robot would successfully remove all the packages from all the bins in a
minimum time of 2 + 4 + 6 = 12. Therefore, the answer is 12.
Function Description
Complete the function minTime in the editor below.
minTime has the following parameter:
int packages[n]: an array of integers denoting the number of packages in each bin
Returns:
long: the minimum amount of time needed for the robot to remove all the packages from the bins
Constraints
n ≤ 5×10^5
1 ≤ packages[i] ≤ 10^9*/
public class MinTime {
    public static void main(String[] args) {
    int[] packages={3,2,1};
    System.out.println(minTime(3, packages));
    }
    public static int minTime(int packagesCount, int[] packages){
        /*//Solucion 1
        int cont=0;
        //Calculo de maximo
        int max=0;
        for (int i = 0; i < packages.length; i++) {
            max=Math.max(max,packages[i]);
            //Carga y descarga de packages
            cont+=packages[i];
        }
        while(max!=0){
            int index=packagesCount;
            for (int i = packagesCount-1; i >= 0; i--) {
                //movimiento de packages
                if(packages[i]>=max){
                    cont+=index-(i);
                    index=i;
                }
            }
            max--;
        }*/
        //Solucion 2
        int cont=0;
        //Calculo de maximo
        int max=0;
        int indexMax=0;
        for (int i = packagesCount-1; i >= 0; i--) {
            max=Math.max(max,packages[i]);
            cont+=packages[i];
            indexMax=max==packages[i]?i:indexMax;
        }
        while(max!=0&&indexMax!=0){
            int index=packagesCount;
            for (int i = indexMax; i >= 0; i--) {
                if(packages[i]>=max){
                    cont+=index-(i);
                    index=i;
                }
            }
            max--;
        }
        return (packagesCount-indexMax)*max+cont;
    }
}
