public class tarea{
    private String id;
    private String descripcion;
    private int prioridad;
    private long tiempoLlegada;

    //constructor
    public tarea ( String id, String descripcion, int prioridad, long tiempoLlegada ){
        //metodos this
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tiempoLlegada = tiempoLlegada;
    }
    //getters
    public String getId(){return id;}
    public String getDescripcion(){return descripcion;}
    public int getPrioridad(){return prioridad;}
    public long getTiempoLlegada(){return tiempoLlegada;}

    @Override
    public String toString(){
        return "[" + id + "-" +descripcion + "-" +prioridad+ "-" +tiempoLlegada+ "]";
    }
}
