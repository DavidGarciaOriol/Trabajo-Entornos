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

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    //Método nº1
    public String coincidenDirGen(Pelicula pelicula, Genero genero, Director director){
        String out = "El género de " + pelicula.getTitulo() + " ";
        if (pelicula.getGenero() != genero)
            out += "no ";
        out += "coincide con el especificado. \nEl director de "+ pelicula.getTitulo() + " ";
        if (pelicula.getDirector().getNombre() != director.getNombre())
            out += "no ";
        out += "coincide con el especificado.";
        return out;
    }

//Método nº2
    public ArrayList<Pelicula> getPeliFromFecha(Fecha fecha) {

        ArrayList<Pelicula> pelisFF = new ArrayList<>();

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getFecha().compareTo(fecha) >= 0)
                pelisFF.add(pelicula);
        }
        return pelisFF;
    }

/*Método nº3
* Este metodo recibe una pelicula,comprube que el arraylist no este vacio,
* recorrerá el arraylist de peliculas de la clase videoclub
* y buscará una pelicula que tenga el mismo director que el de la pelicula que le pasamos.
* @author Miguel Angel Valiente*/

    public Pelicula otraPeliDelDirector(Pelicula pelicula){
        if (!peliculas.isEmpty()) {
            for (Pelicula peli : peliculas) {
                if (pelicula.getDirector() == peli.getDirector() && peli != pelicula)
                    return peli;
            }
        }
        return null;
    }

//Método nº4
    public boolean peliSameGenre(Pelicula pelicula){
        for (Pelicula pelicula1:peliculas){
            if (pelicula.getGenero().equals(pelicula1.getGenero()) && pelicula != pelicula1){
                System.out.println(pelicula1);
                return true;
            }
        } return false;
    }

/*Método nº5
* Este método crea un array donde guardará las peliculas del arraylist de peliculas del videoclub que
* sus titulos tengan entre 10 y 15 caracteres.
* @author Miguel Angel Valiente*/
    public ArrayList<Pelicula> tituloLargo(){
        ArrayList<Pelicula> pelisConTituloLargo = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (p.getTitulo().length() >= 10 && p.getTitulo().length() <= 15) {
                pelisConTituloLargo.add(p);
            }
        }
        return pelisConTituloLargo;
    }

/*Metodo nº6 pasa a estar en la clase Pelicula
* @author Miguel Angel Valiente*/


//Método nº7
    public int getAntig(Pelicula peli){
        Fecha fecha = new Fecha();
        return (fecha.get(Calendar.YEAR) - peli.getFecha().get(Calendar.YEAR));
    }

/*Método nº8
* Este método crea un arraylist donde guardara los generos de las peliculas del videoclub,
* si el genero ya esta en el arraylist no lo guardará, finalmente si el tamaño del arraylist es = o > que 10
* devolvera true(Hay Variedad).
* @author Miguel Angel Valiente*/
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
