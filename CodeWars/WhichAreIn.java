package CodeWars;
import java.util.Arrays;
/*Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

Example 2:
a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
Beware: In some languages r must be without duplicates. */
public class WhichAreIn {
        public static void main(String[] args) {
            String[] array1 = {"apple", "banana", "cherry", "orange"};
            String[] array2 = {"an", "ra", "che"};
    
            String[] result = inArray(array1, array2);
    
            for (String item : result) {
                System.out.println(item);
            }
    }
    public static String[] inArray(String[] array1, String[] array2) {
        String[] result = Arrays.stream(array1)
        .filter(x -> Arrays.stream(array2).anyMatch(s -> s.contains(x)))
        .sorted().toArray(String[]::new);
        return result;
    }
}
