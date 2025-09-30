import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio2 {
    public static void main(String[] args) {

        Deque<String> s1 = new LinkedList<>();

        s1.add("pan blanco");
        s1.add("lechuga");
        s1.add("pan blanco");

        Deque<String> s2 = new LinkedList<>();

        s2.add("pan blanco");
        s2.add("tomate");
        s2.add("pan blanco");

        boolean iguales = s1.peekFirst().equals(s2.peekFirst()) &&
                          s1.peekLast().equals(s2.peekLast());

        System.out.println("¿Tienen el mismo pan? " + iguales);
    }
}
