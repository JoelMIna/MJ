import java.util.LinkedList;
import java.util.Queue;

public class ejercicio7 {
    public static void main(String[] args) {
        String[] palabras = {"Luz", "Casa", "Sol", "Lago"};

        Queue<String> cola = new LinkedList<>();
        for (String p : palabras) {
            cola.add(p);
        }

        Queue<String> resultado = new LinkedList<>();
        while (!cola.isEmpty()) {
            String palabra = cola.poll();
            if (palabra.length() == 4) {
                resultado.add(palabra);
            }
        }

        System.out.println("Palabras de 4 letras: " + resultado);
    }
}
