package CursoAlgoritmosAvanzados.EjerciciosConUnicamenteEstructurasControl;

public class NumeroRomanoADecimal {

    public static void main(String[] args) {
        String romano = "MMMXCLX";
        System.out.println(romanToNum(romano));
    }

    public static int romanToNum(String romano){
        int cont = 0;
        int num = 0;
        for (RomanNumeral numeral : RomanNumeral.values()) {
            while(romano.length() - cont > numeral.toString().length() - 1&&
            romano.substring(cont, cont + numeral.toString().length()).equals(numeral.toString())){
                cont += numeral.toString().length();
                num += numeral.getValue();
            }
        }
        return num;
    }
    enum RomanNumeral {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
        private int value;
        RomanNumeral(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
}
