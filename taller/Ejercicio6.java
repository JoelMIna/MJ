import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] nombres = {"Adam", "Sarah", "Malcolm"};

        Queue<String> cola = new LinkedList<>();
        for (String n : nombres) {
            cola.add(n);
        }

        String letras = "";
        while (!cola.isEmpty()) {
            String nombre = cola.poll();
            char inicial = Character.toUpperCase(nombre.charAt(0));
            letras += inicial;
        }

        char[] arr = letras.toCharArray();
        Arrays.sort(arr);

        String sociedad = new String(arr);
        System.out.println("Sociedad secreta: " + sociedad);
    }
}
