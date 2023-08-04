package PruebasPragma;
/*A customer has posted several web development projects on a freelancing platform, and various web
developers have put in bids for these projects. Given the bid amounts and their corresponding projects,
what is the minimum amount the customer can pay to have all the projects completed?
Note: If any project has no bids, return -1.
Example
numProjects = 3 projects.
projectId = [2, 0, 1, 2]
bid = [8, 7, 6, 9].
projectId[i] is aligned with bid[i]
The first web developer bid 8 currency units for project 2.
The second web developer bid 7 currency units for project 0.
The third web developer bid 6 currency units for project 1.
The fourth web developer bid 9 currency units for project 2.
There is only one choice of who to hire for project 0, and it will cost 7. Likewise, there is only one choice for
project 1, which will cost 6. For project 2, it is optimal to hire the first web developer, instead of the fourth,
and doing so will cost 8. So the final answer is 7 + 6 + 8 = 21.
If instead there were n = 4 projects, the answer would be -1 since there were no bids received on the
fourth project.
Function Description
Complete the function minCost in the editor below.
minCost has the following parameters:
int numProjects: the total number of projects posted by the client (labeled from 0 to n)
int projectId[n]: an array of integers denoting the projects that the freelancers bid on
int bid[n]: an array of integers denoting the bid amounts posted by the freelancers
Returns:
long: the minimum cost the client can spend to complete all projects, or -1 if any project has no bids.
Constraints
1 ≤ numProjects, n ≤ 5×10^5
0 ≤ projectId[i] < n
1 ≤ bid[i] ≤ 10^9
 */
public class FreelancingPlatfom {
    public static void main(String[] args) {
        int numProjects = 3;
        int[] projectId = { 2, 0, 1, 2};
        int[] bid = { 8, 7, 6, 9 };
        System.out.println(minCost(numProjects, projectId.length, projectId, bid.length, bid));
    }

    public static int minCost(int numProjects, int projectId_count, int[] projectId, int bid_count, int[] bid) {
        int[] min=new int[numProjects];
        for (int i = 0; i < bid.length; i++) {
            min[projectId[i]]= Math.min(min[projectId[i]]!=0?min[projectId[i]]:bid[i]+1,bid[i]);
        }
        int cont=0;
        for (int i : min) {
            if(i!=0){
            cont+=i;
            }else{
                cont=-1;
                break;
            }
        }
        return cont;
}

}
