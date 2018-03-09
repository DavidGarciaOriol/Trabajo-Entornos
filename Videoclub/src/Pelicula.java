public class Pelicula {
    private String titulo;
    private Director director;
    private Genero genero;
    private Fecha fecha;

    public Pelicula(String titulo, Director director, Genero genero,Fecha fecha) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.fecha = fecha;
        director.agregarPelicula(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Director getDirector() {
        return director;
    }

    public Genero getGenero() {
        return genero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        String msg="";
        msg+="Título: "+getTitulo()+"\n"+"Director: "+getDirector()+"\n"+"Género: "+getGenero()+"\n"+"Fecha: "+getFecha()+"\n";
        return msg;
    }
}
