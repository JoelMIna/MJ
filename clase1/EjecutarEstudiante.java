package clase1;

import java.util.Arrays;

public class EjecutarEstudiante{
    public static void main(String[] args) {
        // Crear un objeto
        Estudiante objEst1 = new Estudiante(1,  13467890, "Angelica", "Ingenieria");
        Estudiante objEst2 = new Estudiante(2, 127876587, "Miguel", "Ingenieria");
        Estudiante objEst3 = new Estudiante(3, 112243642, "Byron", "Ingenieria");

        

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        // Creacion del arreglo de objetos(Estudiante)
        Estudiante[] e = new Estudiante[4];
        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = objEst3;
        e[3] = new Estudiante(4, 123456789, "Peter", "Ingenieria");
        
        System.out.println(Arrays.toString(e));
        //actividad independiente
        
        // implementar el metodo matricular cursos para estudiantes pueda realizar dichar operacion
    }
}