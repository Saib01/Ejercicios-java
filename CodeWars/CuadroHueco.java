package CodeWars;

public class CuadroHueco {
    public static void main(String[] args) {
        dibujoCuadradoHueco(16);
    }
    public static void dibujoCuadradoHueco(int tamaño){
        StringBuilder[] dibujo={new StringBuilder("*"),new StringBuilder("*")};
        for (int i = 1; i < tamaño; i++) {
            dibujo[0].append("*");
            dibujo[1].append(i<tamaño-1?" ":"*");
        }
        for (int i = 0; i < tamaño; i++) {
                System.out.println((i==0||i==tamaño-1?dibujo[0]:dibujo[1]));
        }
    }
}
