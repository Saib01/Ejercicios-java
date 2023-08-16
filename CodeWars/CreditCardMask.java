package CodeWars;

/*Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

Examples (input --> output):
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""

// "What was the name of your first pet?"
"Skippy" --> "##ippy"
"Nananananananananananananananana Batman!" --> "####################################man!" */
public class CreditCardMask {
    public static void main(String[] args) {
        String str="1234575675685";
        System.out.println(maskify(str).length()==(str).length());
        System.out.println(maskify(str));
    }
    public static String maskify(String str) {
        StringBuilder relleno=new StringBuilder("");
        for (int i = 4; i < str.length(); i++) {
            relleno.append("#");
        }
        return relleno.toString()+str.substring(Math.max(0,str.length()-4),str.length());
    }
}
