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


    /**
     * Method 1
     * @author David
     * @param pelicula
     * @param genero
     * @param director
     * El método te devuelve la confirmación dependiendo de si coinciden o no el género y director especificados con los de la película dada.
     */

    public String coincidenDirGen(Pelicula pelicula, Genero genero, Director director){
        String out = "El género de " + pelicula.getTitulo() + " ";
        if (pelicula.getGenero() != genero) out += "no ";
        out += "coincide con el especificado.\nEl director de "+ pelicula.getTitulo() + " ";
        if (pelicula.getDirector().getNombre() != director.getNombre()) out += "no ";
        out += "coincide con el especificado.";
        return out;
    }


    /**
     * Method 2
     * @author David
     * @param fecha
     * El género te lista un array de películas cuya fecha sea igual o superior a la especificada y te lo devuelve.
     */

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

    /**
     * Method: 4
     *@author David
     * @param pelicula
     * El método te busca en el vídeoclub una película (la más próxima) con el mismo género que la especificada.
     */

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


    /**
     * Method 7
     * @author David
     * @param peli
     * El método te devuelve la antiguedad de la película en años.
     */

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
