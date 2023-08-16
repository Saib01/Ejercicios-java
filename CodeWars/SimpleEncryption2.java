package CodeWars;

import java.util.HashMap;
import java.util.Map;

/*
Index-Difference

For encrypting strings this region of chars is given (in this order!):

all letters (ascending, first all UpperCase, then all LowerCase)
all digits (ascending)
the following chars: .,:;-?! '()$%&"
These are 77 chars! (This region is zero-based.)

Write two methods:

string Encrypt(string text)
string Decrypt(string encryptedText)
Prechecks:

If the input-string has chars, that are not in the region, throw an Exception(C#, Python) or Error(JavaScript).
If the input-string is null or empty return exactly this value!
For building the encrypted string:

For every second char do a switch of the case.
For every char take the index from the region. Take the difference from the region-index of the char before (from the input text! Not from the fresh encrypted char before!). (Char2 = Char1-Char2)
Replace the original char by the char of the difference-value from the region. In this step the first letter of the text is unchanged.
Replace the first char by the mirror in the given region. ('A' -> '"', 'B' -> '&', ...)
Simple example:

Input: "Business"
Step 1: "BUsInEsS"
Step 2: "B61kujla"
B -> U
B (1) - U (20) = -19
-19 + 77 = 58
Region[58] = "6"
U -> s
U (20) - s (44) = -24
-24 + 77 = 53
Region[53] = "1"
Step 3: "&61kujla"

 */
public class SimpleEncryption2 {

    public static void main(String[] args) {
        String txt="Business";
        System.out.println(Encrypt(txt));
        System.out.println(Decrypt(Encrypt(txt)));
    }
    public static BidirectionalMap<Integer, Character> txtMap = new BidirectionalMap<>();
    static {
        int[] h = { 65, 90, 97, 122, 48, 57 };
        for (int i = 0; i < 3; i++) {
            for (int j = h[i * 2]; j <= h[i * 2 + 1]; j++) {
                txtMap.put(txtMap.size(), ((char) j));
            }
        }
        char[] charArray = { '.', ',', ':', ';', '-', '?', '!', ' ', '\'', '(', ')', '$', '%', '&', '"' };
        for (char c : charArray) {
            txtMap.put(txtMap.size(), (c));
        }
    }

    public static String Encrypt(String text) {
        StringBuilder rs = new StringBuilder(text.toUpperCase());
        for (int i = 0; i < text.length(); i++) {
            rs.setCharAt(i, text.charAt(i));
            i++;
        }
        StringBuilder result1 = new StringBuilder(""+txtMap.getValueByKey(Math.abs(txtMap.getKeyByValue(rs.charAt(0)) - (txtMap.size() - 1))));
                for (int i = 0; i < text.length() - 1; i++) {
            int c = txtMap.getKeyByValue(rs.charAt(i)) - txtMap.getKeyByValue(rs.charAt(i + 1));
            result1.append(txtMap.getValueByKey(c >= 0 ? c : c + txtMap.size()));
        }
        return result1.toString();
    }

    public static String Decrypt(String encryptedText) {
        StringBuilder rs = new StringBuilder(
            ""
            +txtMap.getValueByKey(Math.abs(txtMap.getKeyByValue(encryptedText.charAt(0)) 
            - (txtMap.size() - 1))));
        
        for (int i = 0; i < encryptedText.length() - 1; i++) {
            int c = txtMap.getKeyByValue(rs.charAt(i))- txtMap.getKeyByValue(encryptedText.charAt(i + 1));
            rs.append(txtMap.getValueByKey(c > 0 ? c : c + txtMap.size()));
        }
        for (int i = 1; i < encryptedText.length(); i++) {
            rs.setCharAt(i,Character.toLowerCase(rs.charAt(i)));i++;
        }
        return rs.toString();
    }
}

class BidirectionalMap<K, V> {
    private Map<K, V> keyToValueMap;
    private Map<V, K> valueToKeyMap;

    public BidirectionalMap() {
        this.keyToValueMap = new HashMap<>();
        this.valueToKeyMap = new HashMap<>();
    }

    public void put(K key, V value) {
        keyToValueMap.put(key, value);
        valueToKeyMap.put(value, key);
    }

    public V getValueByKey(K key) {
        return keyToValueMap.get(key);
    }

    public K getKeyByValue(V value) {
        return valueToKeyMap.get(value);
    }

    public int size() {
        return keyToValueMap.size();
    }
}