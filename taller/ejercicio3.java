import java.util.Stack;

public class ejercicio3 {
    public static void main(String[] args) {
        int a = 9, b = 27;

        Stack<Integer> pila = new Stack<>();
        pila.push(a);
        pila.push(b);

        int numB = pila.pop();
        int numA = pila.pop();

        double raizA = Math.sqrt(numA);
        double raizCubicaB = Math.cbrt(numB);

        boolean iguales = Math.abs(raizA - raizCubicaB) < 0.0001;

        System.out.println("Resultado: " + iguales);
    }
}
