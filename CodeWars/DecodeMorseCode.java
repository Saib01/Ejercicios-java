package CodeWars;

//MorseCode sirve para traducir los caracteres de morse a letras
public class DecodeMorseCode {
    public static void main(String[] args) {
        decode(".--  .-- .--");
    }

    public static String decode(String morseCode) {
        StringBuilder txt = new StringBuilder();
        for (String string : morseCode.trim().split(" ")) {
            if (MorseCode.get(string) == null && txt.charAt(txt.length() - 1) == ' ') {
                continue;
            }
            txt.append(MorseCode.get(string) != null ? MorseCode.get(string) : " ");
        }
        return txt.toString();
    }
    enum MorseCode {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
        private String value;
        MorseCode(String value) {
            this.value = value;
        }
        public String get() {
            return this.value;
        }
    }
}
