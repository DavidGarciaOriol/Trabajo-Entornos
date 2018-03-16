import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class PruebasM8 {

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

    @Test
    @DisplayName("Prueba 1: hayVariedad")//ArrayList con 9 elementos y con 9 generos.
    void hayVariedad(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.COMEDIA);
        Pelicula p6 = new Pelicula(Genero.DRAMA);
        Pelicula p7 = new Pelicula(Genero.FANTASIA);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);

        assertFalse(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 2: hayVariedad")//ArrayList con 9 elementos y menos de 9 generos.
    void hayVariedad2(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ACCION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.DRAMA);
        Pelicula p7 = new Pelicula(Genero.FANTASIA);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);

        assertFalse(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 3: hayVariedad")//ArrayList con 10 elementos y con 10 generos.
    void hayVariedad3(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.WESTERN);
        Pelicula p7 = new Pelicula(Genero.FANTASIA);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);
        Pelicula p10 = new Pelicula(Genero.TERROR);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);
        prueba.agregarPelicula(p10);

        assertTrue(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 4: hayVariedad")//ArrayList con 10 elementos y menos de 10 generos.
    void hayVariedad4(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.WESTERN);
        Pelicula p7 = new Pelicula(Genero.WESTERN);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);
        Pelicula p10 = new Pelicula(Genero.TERROR);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);
        prueba.agregarPelicula(p10);

        assertFalse(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 5: hayVariedad")//ArrayList con 11 elementos y con 11 generos.
    void hayVariedad5(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.WESTERN);
        Pelicula p7 = new Pelicula(Genero.FANTASIA);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);
        Pelicula p10 = new Pelicula(Genero.TERROR);
        Pelicula p11 = new Pelicula(Genero.THRILLER);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);
        prueba.agregarPelicula(p10);
        prueba.agregarPelicula(p11);

        assertTrue(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 6: hayVariedad")//ArrayList con 11 elementos y con 10 generos.
    void hayVariedad6(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.WESTERN);
        Pelicula p7 = new Pelicula(Genero.FANTASIA);
        Pelicula p8 = new Pelicula(Genero.FANTASIA);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);
        Pelicula p10 = new Pelicula(Genero.TERROR);
        Pelicula p11 = new Pelicula(Genero.THRILLER);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);
        prueba.agregarPelicula(p10);
        prueba.agregarPelicula(p11);

        assertTrue(prueba.hayVariedad());
    }

    @Test
    @DisplayName("Prueba 7: hayVariedad")//ArrayList con 11 elementos y menos de 10 generos.
    void hayVariedad7(){
        Pelicula p1 = new Pelicula(Genero.ACCION);
        Pelicula p2 = new Pelicula(Genero.ANIMACION);
        Pelicula p3 = new Pelicula(Genero.BELICO);
        Pelicula p4 = new Pelicula(Genero.CIENCIAFICCION);
        Pelicula p5 = new Pelicula(Genero.DRAMA);
        Pelicula p6 = new Pelicula(Genero.WESTERN);
        Pelicula p7 = new Pelicula(Genero.WESTERN);
        Pelicula p8 = new Pelicula(Genero.FICCION);
        Pelicula p9 = new Pelicula(Genero.MELODRAMA);
        Pelicula p10 = new Pelicula(Genero.TERROR);
        Pelicula p11 = new Pelicula(Genero.TERROR);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(p2);
        prueba.agregarPelicula(p3);
        prueba.agregarPelicula(p4);
        prueba.agregarPelicula(p5);
        prueba.agregarPelicula(p6);
        prueba.agregarPelicula(p7);
        prueba.agregarPelicula(p8);
        prueba.agregarPelicula(p9);
        prueba.agregarPelicula(p10);
        prueba.agregarPelicula(p11);

        assertFalse(prueba.hayVariedad());
    }
}
