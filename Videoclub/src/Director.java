import java.util.ArrayList;

public class Director {
    String nombre;
    ArrayList<Pelicula>peliculas = new ArrayList<>();

    public Director(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    private String listarPeliculas(){
        String pelis="";
        for (Pelicula peli:peliculas) {
            int i =1;
            pelis = i+"-"+peli.getTitulo()+"\n";
            i++;
        }
     return pelis;
    }

    @Override
    public String toString() {
        String msg ="";
        msg+= getNombre();
        return msg;
    }
}
