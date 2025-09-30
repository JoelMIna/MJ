import java.util.LinkedList;
import java.util.Queue;

public class ejercicio1 {
    public static void main(String[] args) {
        int upvotes = 13;
        int downvotes = 0;

        Queue<Integer> cola = new LinkedList<>();

        // Encolamos los votos (+1 y -1)
        for (int i = 0; i < upvotes; i++) {
            cola.add(1);
        }
        for (int i = 0; i < downvotes; i++) {
            cola.add(-1);
        }

        int suma = 0;
        while (!cola.isEmpty()) {
            suma += cola.poll();
        }

        System.out.println("Resultado: " + suma);
    }
}
