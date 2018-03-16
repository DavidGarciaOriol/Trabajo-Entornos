import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class PruebasM5 {

    static VideoclubOnline videoclub;
    static Pelicula[] peliculas;


    @BeforeAll
    static void crearPeliculas() {
        //VIDEOCLUB
        videoclub = new VideoclubOnline("PacoClub");
        //DIRECTORES
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");
        //FECHA
        Fecha fecha = new Fecha(10, 5, 1998);
        Fecha fecha2 = new Fecha(14, 10, 1990);
        Fecha fecha3 = new Fecha(20, 4, 2004);
        Fecha fecha4 = new Fecha(30, 3, 2006);
        Fecha fecha5 = new Fecha(24, 8, 2007);
        Fecha fecha6 = new Fecha(25, 5, 1998);
        Fecha fecha7 = new Fecha(10, 4, 2009);
        Fecha fecha8 = new Fecha(17, 3, 2010);
        Fecha fecha9 = new Fecha(4, 4, 2014);
        Fecha fecha10 = new Fecha(3, 10, 2011);
        Fecha fecha11 = new Fecha(12, 5, 2015);
        Fecha fecha12 = new Fecha(7, 7, 2017);
        Fecha fecha13 = new Fecha(21, 5, 2003);
        Fecha fecha14 = new Fecha(27, 5, 2013);
        Fecha fecha15 = new Fecha(30, 8, 2010);
        Fecha fecha16 = new Fecha(1, 1, 2001);
        //PELICULA
        peliculas = new Pelicula[16];
        peliculas[0] = new Pelicula("Poltergeist", Spielberg, Genero.TERROR, fecha);
        peliculas[1] = new Pelicula("Psicosis", Hitctcock, Genero.THRILLER, fecha2);
        peliculas[2] = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha3);
        peliculas[3] = new Pelicula("Dunkerque", Nolan, Genero.BELICO, fecha4);
        peliculas[4] = new Pelicula("Indiana Jones", GeorgeLucas, Genero.FICCION, fecha5);
        peliculas[5] = new Pelicula("No cuentes conmigo", GeorgeLucas, Genero.COMEDIA, fecha6);
        peliculas[6] = new Pelicula("Mi Amigo el Gigante", Spielberg, Genero.ANIMACION, fecha7);
        peliculas[7] = new Pelicula("Vértigo", Hitctcock, Genero.CINENEGRO, fecha8);
        peliculas[8] = new Pelicula("El Bueno y el Malo", Spielberg, Genero.WESTERN, fecha9);
        peliculas[9] = new Pelicula("Grease", Tarantino, Genero.MUSICAL, fecha10);
        peliculas[10] = new Pelicula("Interestellar", Nolan, Genero.CIENCIAFICCION, fecha11);
        peliculas[11] = new Pelicula("Metropolis", Hitctcock, Genero.FANTASIA, fecha12);
        peliculas[12] = new Pelicula("La Forma del Agua", Spielberg, Genero.MELODRAMA, fecha13);
        peliculas[13] = new Pelicula("Casablanquisima", GeorgeLucas, Genero.POLICIACA, fecha14);
        peliculas[14] = new Pelicula("Kill Bill: Volumen 1", Tarantino, Genero.DRAMA, fecha15);
        peliculas[15] = new Pelicula("El Caballero Oscuro", Nolan, Genero.ACCION, fecha16);
        //AÑADIR PELICULAS AL VIDEOCLUB
        for (int i = 0; i < peliculas.length; i++) {
            videoclub.agregarPelicula(peliculas[i]);
        }
    }
//PRUEBAS METODO 5
@Test
@DisplayName("Prueba 1: TituloLargo")
void tituloLargo1(){
    Pelicula p2 = new Pelicula("Metrópolis");
    VideoclubOnline prueba = new VideoclubOnline("Prueba");
    prueba.agregarPelicula(p2);

    ArrayList<Pelicula> peliculasEsperadas= prueba.getPeliculas();
    ArrayList<Pelicula> peliculasResultado=prueba.tituloLargo();

    assertEquals(peliculasEsperadas.size(),peliculasResultado.size());
    for (int i = 0; i < peliculasEsperadas.size(); i++) {
        assertSame(peliculasEsperadas.get(i),peliculasResultado.get(i));
    }
}

    @Test
    @DisplayName("Prueba 2: TituloLargo")
    void tituloLargo2(){
        Pelicula p1 = new Pelicula("Dunkerque");
        Pelicula p2 = new Pelicula("Metrópolis");
        Pelicula p3 = new Pelicula("Interestellar");
        Pelicula p4 = new Pelicula("Casablanquisima");
        Pelicula p5 = new Pelicula("La Forma del Agua");
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);

        ArrayList<Pelicula> peliculasEsperadas=new ArrayList<>();
        peliculasEsperadas.add(p2);
        peliculasEsperadas.add(p3);
        peliculasEsperadas.add(p4);

        ArrayList<Pelicula> peliculasResultado=prueba.tituloLargo();

        assertEquals(peliculasEsperadas.size(),peliculasResultado.size());

        Iterator it = peliculasEsperadas.iterator();
        while (it.hasNext()){
            Pelicula peliculaEsperada = (Pelicula) it.next();
            assertTrue(peliculasResultado.contains(peliculaEsperada));
        }
    }

    @Test
    @DisplayName("Prueba 3: TituloLargo")
    void tituloLargo3(){
        Pelicula p1 = new Pelicula("Dunkerque");
        Pelicula p2 = new Pelicula("Metrópolis");
        Pelicula p3 = new Pelicula("Interestellar");
        Pelicula p4 = new Pelicula("Casablanquisima");
        Pelicula p5 = new Pelicula("La Forma del Agua");
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);

        ArrayList<Pelicula> peliculasEsperadas=new ArrayList<>();
        peliculasEsperadas.add(p1);
        peliculasEsperadas.add(p5);

        ArrayList<Pelicula> peliculasResultado=prueba.tituloLargo();

        assertNotEquals(peliculasEsperadas.size(),peliculasResultado.size());

        Iterator it = peliculasEsperadas.iterator();
        while (it.hasNext()){
            Pelicula peliculaEsperada = (Pelicula) it.next();
            assertFalse(peliculasResultado.contains(peliculaEsperada));
        }
    }

    @Test
    @DisplayName("Prueba 4: TituloLargo")
    void tituloLargo4(){
        Pelicula p1 = new Pelicula("Dunkerque");
        Pelicula p2 = new Pelicula("Metrópolis");
        Pelicula p3 = new Pelicula("Interestellar");
        Pelicula p4 = new Pelicula("Casablanquisima");
        Pelicula p5 = new Pelicula("La Forma del Agua");
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);

        ArrayList<Pelicula> peliculasEsperadas = new ArrayList<>();
        peliculasEsperadas.add(p1);
        peliculasEsperadas.add(p2);
        peliculasEsperadas.add(p3);
        ArrayList<Pelicula> peliculasResultado = prueba.tituloLargo();
        assertEquals(peliculasEsperadas.size(),peliculasResultado.size());
        Iterator it = peliculasEsperadas.iterator();
        int c = 0;
        while (it.hasNext()){
            Pelicula peliculaEsperada = (Pelicula)it.next();
            if (peliculasEsperadas.contains(peliculaEsperada))
                c++;
        }
        assertTrue(c==peliculasEsperadas.size());
    }

    @Test
    @DisplayName("Prueba 5: TituloLargo")
    void tituloLargo5() {
        Pelicula p1 = new Pelicula("Dunkerque");
        Pelicula p2 = new Pelicula("El Caballero Oscuro");
        Pelicula p3 = new Pelicula("Kill Bill: Volumen 1");
        Pelicula p4 = new Pelicula("El Bueno y el Malo");
        Pelicula p5 = new Pelicula("La Forma del Agua");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);

        ArrayList<Pelicula> peliculasEsperadas = new ArrayList<>();
        peliculasEsperadas.add(p2);
        peliculasEsperadas.add(p3);
        peliculasEsperadas.add(p4);
        ArrayList<Pelicula> peliculasResultado = prueba.tituloLargo();

        assertNotEquals(peliculasEsperadas.size(),peliculasResultado.size());
        assertNotNull(peliculasResultado);
    }
}
