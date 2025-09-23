import java.util.Vector;

public class Bloque5 {
    public static void main(String[] args) {

        //Reemplazo de elementos
        Vector<String> nombres = new Vector<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");

        System.out.println("Vector inicial: " + nombres);

        // set()
        nombres.set(1, "Carlos"); 
        System.out.println("Después de set(1, \"Carlos\"): " + nombres);

        // setElementAt()
        nombres.setElementAt("Pedro", 0);
        System.out.println("Después de setElementAt(\"Pedro\", 0): " + nombres);

        // copyInto()
        String[] arreglo = new String[nombres.size()];
        nombres.copyInto(arreglo);
        System.out.print("Arreglo copiado con copyInto(): ");
        for (String s : arreglo) {
            System.out.print(s + " ");
        }
        System.out.println();

        // replaceAll()
        nombres.replaceAll(n -> n.toUpperCase()); 
        System.out.println("Después de replaceAll(toUpperCase): " + nombres);
    }


    }

