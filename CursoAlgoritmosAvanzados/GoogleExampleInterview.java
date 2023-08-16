package CursoAlgoritmosAvanzados;

import java.util.HashSet;

public class GoogleExampleInterview {
    public static void main(String[] args) {
        int[] nums={1,2,4,4};
        int sum=8;
        String out="No";//
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            int complement = sum - num;
            if (numSet.contains(complement)) {
                out = "Yes";
                break;
            }
            numSet.add(num);
        }


        System.out.println(out);
    }
    
}
