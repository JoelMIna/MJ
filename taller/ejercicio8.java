import java.util.LinkedList;
import java.util.Queue;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {2, 8, 7, 5};

        Queue<Integer> cola = new LinkedList<>();
        for (int n : numeros) {
            cola.add(n);
        }

        int sumaPares = 0, sumaImpares = 0;

        while (!cola.isEmpty()) {
            int num = cola.poll();
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }

        int diferencia = Math.abs(sumaImpares - sumaPares);
        System.out.println("Diferencia: " + diferencia);
    }
}
