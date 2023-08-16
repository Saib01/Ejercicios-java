package CodeWars;
//Eliminar el segundo elemento de cada 2 elementos
public class RemoveElements {
    public static void main(String[] args) {
        removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again"  });
    }

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] newObject = new Object[1 + arr.length / 2];
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
                newObject[cont++] = arr[i++];
        }
        return newObject;
    }
}
