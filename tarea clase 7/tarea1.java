
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;

public class tarea1 {

    public static void main(String[] args) {

        //Iteración y Recorrido
        
        Vector<String> paises = new Vector<>();
        paises.add("Colombia");
        paises.add("México");
        paises.add("Chile");
        paises.add("Argentina");

        System.out.println("Vector inicial: " + paises);

        // forEach con lambda
        System.out.println("\nRecorrido con forEach:");
        paises.forEach(p -> System.out.println("País: " + p));

        // iterator
        System.out.println("\nRecorrido con Iterator:");
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            System.out.println("País: " + it.next());
        }

        // listIterator hacia adelante y atrás
        System.out.println("\nRecorrido con ListIterator:");
        ListIterator<String> lit = paises.listIterator();
        while (lit.hasNext()) {
            System.out.println("Adelante: " + lit.next());
        }
        while (lit.hasPrevious()) {
            System.out.println("Atrás: " + lit.previous());
        }

        // elements()
        System.out.println("\nRecorrido con Enumeration:");
        Enumeration<String> en = paises.elements();
        while (en.hasMoreElements()) {
            System.out.println("País: " + en.nextElement());
        }
    }
}


