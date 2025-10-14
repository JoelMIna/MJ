package parcial;

 import java . util . HashMap ;
 import java . util . Map ;
 import java . util . Scanner ;

 public class ExamenColaMapa {

 static class ColaCircularEnteros {
 private int [] datos ;
 private int cabeza ;
 private int cola ;
 private int tam ;

 public ColaCircularEnteros ( int capacidad ) {
 datos = new int [ capacidad ];
 cabeza = 0;
 cola = 0;
 tam = 0;
 }

 public boolean estaVacia () { return tam == 0; }
 public boolean estaLlena () { return tam == datos . length ; }

 public void encolar ( int x ) {
 if ( estaLlena () ) throw new IllegalStateException (" Cola llena") ;
 datos [ cola ] = x ;
 cola = ( cola + 1) % datos . length ;
 tam ++;
 }

 public int desencolar () {
 if ( estaVacia () ) throw new IllegalStateException (" Cola v a c a ") ;
 int v = datos [ cabeza ];
 cabeza = ( cabeza + 1) % datos . length ; 
    tam --;
 return v ;
 }
 }

 // (50 pts ) Calcula el balance de parentesis encolando +1 y -1.

 public static int balanceConCola ( String s ) {
    // creamos una cola circular con una capacidad igual a la lonmgitud de la cadena 
    ColaCircularEnteros cola = new ColaCircularEnteros (s.length());
     //Recorrer cada caracter de la cadena
    for (char c : s.toCharArray()) {
        // Si es '(', encolar +1
        if (c == '(') {
            cola.encolar(1);
        // Si es ')', encolar -1
        } else { if (c == ')') {
            cola.encolar(-1);
       
            }
    }
    }
    //creamos uun contador
    int suma = 0;
     //Mientras la cola no esté vacía, desencolar y sumar
      while (!cola.estaVacia()) {
        suma += cola.desencolar();
    }
    // Retornar la suma, que representa el balance de paréntesis
    return suma;
      }




 // (50 pts ) Registra intentos por nombre en un mapa .

 public static int registrarIntento ( Map < String , Integer > intentos , String nombre ) {
    
   // Verificar si el nombre ya existe en el mapa
   if (intentos.containsKey(nombre)) {
       // Si existe, incrementar el contador en 1
       int contadorActual = intentos.get(nombre);
       intentos.put(nombre, contadorActual + 1);
       return contadorActual + 1;
   } else {
       // Si no existe, iniciar en 1
       intentos.put(nombre, 1);
       return 1;
   }
 }
 

 
 public static void main ( String [] args ) {
 Scanner sc = new Scanner ( System . in ) ;
 String cadena = sc . nextLine () ;
 System . out . println (" Balance cola : " + balanceConCola ( cadena ) ) ;

 Map < String , Integer > intentos = new HashMap < String , Integer >() ;
 System . out . println (" Intentos ( Ana ): " + registrarIntento (
    intentos , "Ana") ) ;
 System . out . println (" Intentos ( Ana ): " + registrarIntento (
    intentos , "Ana") ) ;

 sc . close () ;
 }
 }
