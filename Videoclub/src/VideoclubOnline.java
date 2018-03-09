import java.util.ArrayList;

public class VideoclubOnline {
    private ArrayList<Pelicula>peliculas = new ArrayList<Pelicula>();
    private String nombre;

    public VideoclubOnline(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pelicula> tituloLargo(){
        ArrayList<Pelicula> pelisConTituloLargo = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (p.getTitulo().length()>10 && p.getTitulo().length()<15){
                pelisConTituloLargo.add(p);
            }
        }
        return pelisConTituloLargo;
    }

    public boolean peliculasIguales(Pelicula p){
        return this.equals(p);
    }

    public boolean hayVariedad(){
        ArrayList<Genero> generos = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (!generos.contains(p.getGenero())){
                generos.add(p.getGenero());
            }
        }
        return generos.size() >= 10;
    }

    public Pelicula otraPeliDelDirector(Pelicula pelicula){
        for (Pelicula peli:peliculas) {
            if (pelicula.getDirector()==peli.getDirector() && pelicula!=peli)
                return peli;
        }
        return null;
    }
}
