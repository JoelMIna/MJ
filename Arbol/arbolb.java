

public class ArbolRecorridos {


    // Clase interna Nodo

    static class Nodo {
        String valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(String valor) {
            this.valor = valor;
            izquierdo = null;
            derecho = null;
        }
    }

    
    // Clase Árbol Binario

    static class ArbolBinario {
        Nodo raiz;

        // Constructor: crea un árbol vacío
        ArbolBinario() {
            raiz = null;
        }

    
        // RECORRIDO PREORDEN
        // (Raíz → Izquierdo → Derecho)
        
        void preorden(Nodo nodo) {
            if (nodo != null) {
                System.out.print(nodo.valor + " ");
                preorden(nodo.izquierdo);
                preorden(nodo.derecho);
            }
        }

    
        // RECORRIDO INORDEN
        // (Izquierdo → Raíz → Derecho)
        void inorden(Nodo nodo) {
            if (nodo != null) {
                inorden(nodo.izquierdo);
                System.out.print(nodo.valor + " ");
                inorden(nodo.derecho);
            }
        }
        // RECORRIDO POSTORDEN
        // (Izquierdo → Derecho → Raíz)
        void postorden(Nodo nodo) {
            if (nodo != null) {
                postorden(nodo.izquierdo);
                postorden(nodo.derecho);
                System.out.print(nodo.valor + " ");
            }
        }
    }
    // Método main para probar el árbol
    public static void main(String[] args) {

        // Crear el árbol

        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new Nodo("1");
        arbol.raiz.izquierdo = new Nodo("6");
        arbol.raiz.izquierdo.izquierdo = new Nodo("5");
        arbol.raiz.izquierdo.derecho = new Nodo("8");
        arbol.raiz.izquierdo.derecho.derecho = new Nodo("4");
        arbol.raiz.izquierdo.derecho.derecho.izquierdo = new Nodo("3");
        arbol.raiz.izquierdo.derecho.derecho.izquierdo.izquierdo = new Nodo("9");
        arbol.raiz.izquierdo.derecho.derecho.derecho = new Nodo("2");
        arbol.raiz.izquierdo.derecho.derecho.derecho.izquierdo = new Nodo("7");
        arbol.raiz.izquierdo.derecho.derecho.derecho.izquierdo.derecho = new Nodo("11");
        arbol.raiz.izquierdo.derecho.derecho.derecho.derecho = new Nodo("10");

        // Mostrar los tres recorridos
        System.out.println("Recorrido en PREORDEN:");
        arbol.preorden(arbol.raiz);

        System.out.println("\n\nRecorrido en INORDEN:");
        arbol.inorden(arbol.raiz);

        System.out.println("\n\nRecorrido en POSTORDEN:");
        arbol.postorden(arbol.raiz);
    }
}