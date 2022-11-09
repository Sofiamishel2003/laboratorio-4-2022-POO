public class cancion
{
    private String nombre;
    private String autor;
    private String genero;
    private String tiempo;

    public cancion(){ //constructor
        nombre = "";
        autor = "";
        genero = "";
        tiempo = "";
    }
    public cancion(String nombre, String autor, String genero, String tiempo){ //constructor
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.tiempo = tiempo;
    }
    public String get_nombre() { //sets y gets
        return this.nombre;
    }
    public String get_autor() { //sets y gets
        return this.autor;
    }
    public String get_tiempo() { //sets y gets
        return this.tiempo;
    }
    public String get_genero() { //sets y gets
        return this.genero;
    }
}