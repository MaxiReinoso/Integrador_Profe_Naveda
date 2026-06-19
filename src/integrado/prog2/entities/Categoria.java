package integrado.prog2.entities;

public class Categoria extends Base {
    private String nombre;
    private String descripcion;

    //constructor vacio
    public Categoria(){ super();}

    //constructor relleno
    public Categoria(String descripcion, String nombre) {
        super();
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    // getters y setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    @Override
    // to string para la lista en consola
    public String toString(){
        return "ID: " + getId() + " | Nombre: " + getNombre() + " | Descripcion: " + descripcion;
    }
}
