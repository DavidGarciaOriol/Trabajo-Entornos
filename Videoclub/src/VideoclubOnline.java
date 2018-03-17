import java.util.ArrayList;
import java.util.Calendar;

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

//Método nº1
    public String coincidenDirGen(Pelicula pelicula, Genero genero, Director director){
        String out = "El género de " + pelicula.getTitulo() + " ";
        if (pelicula.getGenero() != genero) out += "no ";
        out += "coincide con el especificado.\nEl director de "+ pelicula.getTitulo() + " ";
        if (pelicula.getDirector().getNombre() != director.getNombre()) out += "no ";
        out += "coincide con el especificado.";
        return out;
    }

//Método nº2
    public ArrayList<Pelicula> getPeliFromFecha(Fecha fecha){

        ArrayList<Pelicula>pelisFF = new ArrayList<>();

        for(Pelicula pelicula:peliculas){
            if(pelicula.getFecha().compareTo(fecha) >= 0)
                pelisFF.add(pelicula);
        } return pelisFF;
    }

//Método nº3
    public Pelicula otraPeliDelDirector(Pelicula pelicula){
        for (Pelicula peli:peliculas) {
            if (pelicula.getDirector()==peli.getDirector() && pelicula!=peli)
                return peli;
        }
        return null;
    }

//Método nº4
    public boolean peliSameGenre(Pelicula pelicula){
        for (Pelicula pelicula1:peliculas){
            if (pelicula.getGenero() == pelicula1.getGenero() && pelicula != pelicula1){
                System.out.println(pelicula1);
                return true;
            }
        } return false;
    }

    //Método nº5
    public ArrayList<Pelicula> tituloLargo(){
        ArrayList<Pelicula> pelisConTituloLargo = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (p.getTitulo().length()>10 && p.getTitulo().length()<15){
                pelisConTituloLargo.add(p);
            }
        }
        return pelisConTituloLargo;
    }


//Método nº7
    public int getAntig(Pelicula peli){
        Fecha fecha = new Fecha();
        return (fecha.get(Calendar.YEAR) - peli.getFecha().get(Calendar.YEAR));
    }

//Método nº8
    public boolean hayVariedad(){
        ArrayList<Genero> generos = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (!generos.contains(p.getGenero())){
                generos.add(p.getGenero());
            }
        }
        return generos.size() >= 10;
    }
}
