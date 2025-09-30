import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,0};

        if (numeros.length != 10) {
            System.out.println("Error: deben ser 10 dígitos.");
            return;
        }

        Queue<Integer> cola = new LinkedList<>();
        for (int n : numeros) {
            cola.add(n);
        }

        String telefono = "(";
        for (int i = 0; i < 3; i++) telefono += cola.poll();
        telefono += ") ";
        for (int i = 0; i < 3; i++) telefono += cola.poll();
        telefono += "-";
        for (int i = 0; i < 4; i++) telefono += cola.poll();

        System.out.println("Teléfono: " + telefono);
    }
}
