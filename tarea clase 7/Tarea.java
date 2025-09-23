import java.util.Arrays;
import java.util.Vector;

public class Tarea {

    public static void main(String[] args) {
        
        //metodos de incerccion 

         Vector<String> frutas = new Vector<>();

        // add()
        frutas.add("Manzana");
        frutas.add("Banano");

        // add(int index, E e)
        frutas.add(1, "Pera");

        // addElement()
        frutas.addElement("Naranja");

        // addAll()
        frutas.addAll(Arrays.asList("Uva", "Mango"));

        // insertElementAt()
        frutas.insertElementAt("Sandía", 2);

        System.out.println("FRUTAS: " + frutas);

        //Acceso y Consulta de elementos

        Vector<String> colores = new Vector<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");

        // get()
        System.out.println("Elemento en índice 1: " + colores.get(1));

        // firstElement()
        System.out.println("Primer elemento: " + colores.firstElement());

        // lastElement()
        System.out.println("Último elemento: " + colores.lastElement());

        // elementAt()
        System.out.println("Elemento en índice 2 con elementAt: " + colores.elementAt(2));



        //busqueda

        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);

        // contains()
        System.out.println("¿Contiene el número 30? " + numeros.contains(10));

        // indexOf()
        System.out.println("Primera posición de 20: " + numeros.indexOf(20));

        // lastIndexOf()
        System.out.println("Última posición de 20: " + numeros.lastIndexOf(20));

        // equals()
        Vector<Integer> numeros2 = new Vector<>();
        numeros2.add(10);
        numeros2.add(20);
        numeros2.add(30);
        numeros2.add(20);
        numeros2.add(40);

        System.out.println("¿numeros es igual a numeros2? " + numeros.equals(numeros2));


        //eliminacion 


        Vector<String> animales = new Vector<>();

        animales.addAll(Arrays.asList("Perro", "Gato", "Loro", "Gato", "Tigre"));

        System.out.println("Vector inicial: " + animales);

        // remove(int index)
        animales.remove(2); // elimina el elemento en índice 2 (Loro)
        System.out.println("Después de remove(2): " + animales);

        // remove(Object o)
        animales.remove("Gato"); // elimina la primera ocurrencia de "Gato"
        System.out.println("Después de remove(\"Gato\"): " + animales);

        // removeElement(Object o)
        animales.removeElement("Tigre"); 
        System.out.println("Después de removeElement(\"Tigre\"): " + animales);

        // removeElementAt(int index)
        animales.removeElementAt(0); // elimina en índice 0
        System.out.println("Después de removeElementAt(0): " + animales);

        // removeAll(Collection c)
        animales.addAll(Arrays.asList("Vaca", "Caballo", "Perro"));
        animales.removeAll(Arrays.asList("Perro", "Vaca"));
        System.out.println("Después de removeAll([Perro, Vaca]): " + animales);

        // removeAllElements()
        animales.removeAllElements();
        System.out.println("Después de removeAllElements(): " + animales);

        // clear()
        animales.add("León");
        animales.add("Zorro");
        animales.clear();
        System.out.println("Después de clear(): " + animales);


        //Tamaño y capacidad

        Vector<Integer> numeros1 = new Vector<>(3); // capacidad inicial 3

        numeros1.add(1);
        numeros1.add(2);

        System.out.println("Tamaño actual: " + numeros1.size());
        System.out.println("Capacidad actual: " + numeros1.capacity());

        // ensureCapacity()
        numeros1.ensureCapacity(10);
        System.out.println("Capacidad después de ensureCapacity(10): " + numeros1.capacity());

        // setSize()
        numeros1.setSize(5);
        System.out.println("Después de setSize(5): " + numeros1);
        System.out.println("Nuevo tamaño: " + numeros1.size());

        // trimToSize()
        numeros1.trimToSize();
        System.out.println("Capacidad después de trimToSize(): " + numeros1.capacity());

    }

}