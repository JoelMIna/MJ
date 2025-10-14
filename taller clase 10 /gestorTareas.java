import java.util.*;

public class gestorTareas {
    private Queue<tarea> colaEspera; // tareas de 1 o 2
    private Stack<tarea> pilaPrioridad; // urgentes 3
    private Map<String, String> completadas;
    public gestorTareas (){
      colaEspera = new LinkedList<> ( );
      pilaPrioridad = new Stack<> ( );
        completadas = new HashMap<> ( );

    }
    public void agregarTareas(tarea tarea){
        if(tarea.getPrioridad()== 3){
            pilaPrioridad.push(tarea);
            System.out.println( tarea);
        }else{
            colaEspera.offer(tarea);
            System.out.println(tarea);
        }
    }
   public tarea siguienteTarea(){
    tarea tarea = null;

        if(!pilaPrioridad.isEmpty()){
            tarea = pilaPrioridad.pop();
        }else if(!colaEspera.isEmpty()){
            tarea = colaEspera.poll();
        }else{
            System.out.println("No hay tareas pendientes");
        }
        return tarea;
   }
   
}

   


