import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arreglo = {10, 40, 30, 20, 50};

        Queue<Integer> cola = new LinkedList<>();
        for (int n : arreglo) {
            cola.add(n);
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            if (actual > max1) {
                max2 = max1;
                max1 = actual;
            } else if (actual > max2 && actual != max1) {
                max2 = actual;
            }
        }

        // Caso: todos iguales
        if (max2 == Integer.MIN_VALUE) {
            max2 = max1;
        }

        System.out.println("Segundo mayor: " + max2);
    }
}
