public class Pelicula {
    private String titulo;
    private Director director;
    private Genero genero;
    private Fecha fecha;

    public Pelicula(){

    }

    public Pelicula(String titulo){
        this.titulo=titulo;
    }

    public Pelicula(Genero genero){
        this.genero=genero;
    }

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

    public boolean sonIguales(Pelicula p){
        return this.pelisIguales(p);
    }

    public boolean pelisIguales(Object obj){
        if (obj instanceof Pelicula){
            Pelicula p = (Pelicula) obj;
            if (this.titulo.equals(p.titulo)&&this.director.equals(p.director)&&this.genero.equals(p.genero)
                    && this.fecha.equals(p.fecha)){
                return true;
            }else
                return false;
        }else
            return false;
    }

    @Override
    public String toString() {
        String msg="";
        msg+="Título: "+getTitulo()+"\n"+"Director: "+getDirector()+"\n"+"Género: "+getGenero().getGenero()+"\n"+"Fecha: "+getFecha()+"\n";
        return msg;
    }
}
