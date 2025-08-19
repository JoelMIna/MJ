public class Estudiante{
    //atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;

    //constructor
    public Estudiante(int id, int cedula, String nombre, String facultad) {

        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }
    //metodo matricularCurso
    public void matricularCurso(String[] curso) {
       System.out.println(Arrys.toString(curso));
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Estudiante: [id: " + id + "cedula: " + cedula + "Nombre:" + nombre + "Facultad:"+facultad+"]" ;
}   