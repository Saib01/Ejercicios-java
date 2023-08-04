package CursoAlgoritmosAvanzados;

public class DistanciaHamming {
    public static void main(String[] args) {
        String text1="patitosw";
        String text2="paratosa";
        if(text1.length()!=text2.length()){
            throw new RuntimeException("Longitudes diferentes");
        }else{
            for (int i = 0; i < text2.length(); i++) {
                if(text1.charAt(i)!=text2.charAt(i)){
                    System.out.println("Caracteres iguales :"+i);
                    break;
                }
            }
        }
    }
}
