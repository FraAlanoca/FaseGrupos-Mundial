public class Equipo {
    private String nombre;
    private String descripcion;

    //Declaramos los valores de cada equipo
    public Equipo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
