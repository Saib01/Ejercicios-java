package PruebasPragma;

public class Restock {
/*A purchasing manager must buy a specific number of units of an item to replenish the warehouse. The
primary supplier has a list of containers, each with a number of units. The manager must buy contiguous
containers, starting at container 0 and continuing until at least the desired number has been purchased. If
there are not enough units available, they must be purchased from another supplier. If any excess items 
must be purchased, they must be resold. Determine the remaining number of items to be purchased or
sold after purchasing from the primary supplier.
Example
n=5
itemCount = [10, 20, 30, 40, 15]
target = 80
The manager starts buying at index 0 and continues until all available units are purchased or until at least
80 units have been purchased. The manager will buy containers with itemCounts = 10 + 20 + 30 + 40 =
100. Since too many items were purchased, the number sold is purchased - target = 100 - 80 = 20 units.
If the target = 130, the manager will purchase all of the units from the primary supplier for a total of
purchases = 115. Then another target - purchases = 130 - 115 = 15 additional units must be purchased.
Function Description
Complete the function restock in the editor below.
restock has the following parameter(s):
int itemCount[n]: an array of integers that denote the item counts of the each container in the order they
must be purchased
int : target: an integer that denotes the target number of items needed
Returns:
int: number of units that must be resold or that must be purchased from an alternate supplier.
Constraints
1 ≤ n ≤ 10
1 ≤ target ≤ 10
1 ≤ itemCount[i] ≤ 10^9*/
    public static void main(String[] args) {
        int[]itemsCount={1,2,3,1};
        System.out.println(restock(5,itemsCount,4));
    }

    public static int restock(int n,int[] itemsCount,int target){
        int objetivo=0;
        for (int i = 0; i < itemsCount.length; i++) {
            if(objetivo<target){
                objetivo+=itemsCount[i];
            }else{
                break;
            }
        }
        return Math.abs(objetivo-target);
    }
}
