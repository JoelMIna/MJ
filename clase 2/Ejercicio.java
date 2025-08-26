class Libro {
    String titulo;
    String autor;
    double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
}
public class Ejercicio {
    public static void main(String[] args) {
        // Crear un arreglo de objetos de la clase Libro
        Libro[] libros = new Libro[5];
        libros[0] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 49.000);
        libros[1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 45.000);
        libros[2] = new Libro("Lo que el viento se llevó", "Margaret Mitchell", 93.319);
        libros[3] = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 49.900);
        libros[4] = new Libro("La culpa es de la vaca", "Jaime Lopera Gutiérrez y Marta Inés Bernal Trujillo", 54.900);
    
        // Calcular el precio total
        double precioTotal = 0;
        for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro: " + libros[i].titulo + ", Autor: " + libros[i].autor + ", Precio: $" + libros[i].precio);
            precioTotal += libros[i].precio;
        }
        System.out.println("Precio total de todos los libros: $" + precioTotal);
    }
}



