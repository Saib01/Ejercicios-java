package CursoAlgoritmosAvanzados;

public class ContadorPalabras {
    public static void main(String[] args) {
        String text="      hola mundo, dasd asdas dasd     ";
        System.out.println(text.trim().split(" ").length);
    }
}
