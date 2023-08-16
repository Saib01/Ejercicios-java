package CodeWars;
/*
Alternating Split
Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.

Examples:

encrypt("012345", 1)  =>  "135024"
encrypt("012345", 2)  =>  "135024"  ->  "304152"
encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

encrypt("01234", 1)  =>  "13024"
encrypt("01234", 2)  =>  "13024"  ->  "32104"
encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
Together with the encryption function, you should also implement a decryption function which reverses the process.

If the string S is an empty value or the integer N is not positive, return the first argument without changes.



 */
public class SimpleEncryption {
    public static void main(String[] args) {
        System.out.println(encrypt("01234", 3));
        System.out.println(decrypt(encrypt("01234", 3),3));
    }

    public static String encrypt(final String text, final int n) {
        String result = text;
        for (int k = 0; k < n; k++) {
            StringBuilder s = new StringBuilder();
            for (int j = 1; j >= 0; j--) {
                for (int i = j; i < text.length(); i++) {
                    s.append(result.charAt(i));
                    i++;
                }
            }
            result = s.toString();
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String result = encryptedText;
        for (int k = 0; k < n; k++) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < (encryptedText.length()+1)/2; i++) {
                s.append(result.charAt(i+encryptedText.length()/2));
                s.append(result.charAt(i));
            }
            result = s.toString().substring(0, encryptedText.length());
        }
        return result;
    }


    /*
    import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Kata {

  public static String encrypt(final String text, final int n) {
    if(text == null || n < 1) return text;
    String first = IntStream.range(0, text.length())
                            .filter(i -> i%2 == 1)
                            .mapToObj(i -> text.charAt(i))
                            .map(Object::toString)
                            .collect(Collectors.joining(""));
    String second = IntStream.range(0, text.length())
                              .filter(i -> i%2 == 0)
                              .mapToObj(i -> text.charAt(i))
                              .map(Object::toString)
                              .collect(Collectors.joining(""));
    return encrypt(first + second, n - 1);
}
  
  
  public static String decrypt(final String text, final int n) {
    if(text == null || n < 1) return text;
    String decrypted = IntStream.range(0, text.length())
                              .mapToObj(i -> (i%2 == 1) ? text.charAt(i/2) : text.charAt(text.length()/2 + i/2))
                              .map(Object::toString)
                              .collect(Collectors.joining(""));
   return decrypt(decrypted, n - 1);                     
  }
}
     */
}
