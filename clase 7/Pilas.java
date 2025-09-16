import java.util.Stack;

public class Pilas {

public static void main(String[]args){
    //crear la pila 
    Stack<Integer> pila = new Stack<> ();


    // verificar si la pila esta vacia 
    System.out.println(pila.empty()); // true

    //IMPRIMIR pila

    pila.push(8);
    pila.push(4);
    pila.push(9);
    pila.push(10);
    pila.push(6);

    System.out.println("pila"+ pila);

    //mostrar el elemento que esta ene el tope de la pila sin removerlo
    System.out.println("  tope de la pila : "+ pila.peek());

    //remover el elemento que se encuentra en el tope de la pila
    System.out.println("elemento removido del tope de la pila:" + pila.pop());

    //imprimir pila
    System.out.println(pila);

    // buscar y mostrar la posicion del elemento dentro de la pila
    System.out.println(pila.search(10));
    System.out.println(pila.search(9));
    System.out.println(pila.search(4));
    System.out.println(pila.search(8));
    System.out.println(pila.search(50));

    System.out.println(pila.empty()); // false

     //llamar el método para validar los paréntesis
        ejercicio objOp = new ejercicio();

        String[] signos = {"(","(",")",")"};

        System.out.println(objOp.validarParentesisi(signos));
    
}
}
//https://github.com/johnhcano/programacionIII/blob/main/22025-S441A/Clase7/PilaS441.java

