import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] nombres = {"Adam", "Sarah", "Malcolm"};

        Queue<String> cola = new LinkedList<>();
        for (int i = 0; i < nombres.length; i++) {
            cola.add(nombres[i]);
        }
        String letras  = "";
        int count = cola.size();
        for (int i = 0; i < count; i++) {

            letras +=  cola.poll().charAt(0);
        
    }
    
    }
    return letras;
}
