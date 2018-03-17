import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;



public class AllTests {

    static VideoclubOnline videoclub;
    static Pelicula[] peliculas;


    @BeforeAll

    static void crearPeliculas() {

    static void crearPeliculas(){
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

        Fecha fecha = new Fecha(10,5,1998);
        Fecha fecha2 = new Fecha(14,10,1990);
        Fecha fecha3 = new Fecha(20,4,2004);
        Fecha fecha4 = new Fecha(30,3,2006);
        Fecha fecha5 = new Fecha(24,8,2007);
        Fecha fecha6 = new Fecha(25,5,1998);
        Fecha fecha7 = new Fecha(10,4,2009);
        Fecha fecha8 = new Fecha(17,3,2010);
        Fecha fecha9 = new Fecha(4,4,2014);
        Fecha fecha10 = new Fecha(3,10,2011);
        Fecha fecha11 = new Fecha(12,5,2015);
        Fecha fecha12 = new Fecha(7,7,2017);
        Fecha fecha13 = new Fecha(21,5,2003);
        Fecha fecha14 = new Fecha(27,5,2013);
        Fecha fecha15 = new Fecha(30,8,2010);
        Fecha fecha16 = new Fecha(1,1,2001);

        //PELICULA
        peliculas = new Pelicula[16];
        peliculas[0]= new Pelicula("Poltergeist",Spielberg,Genero.TERROR,fecha);
        peliculas[1]= new Pelicula("Psicosis",Hitctcock,Genero.THRILLER,fecha2);
        peliculas[2]= new Pelicula("Pulp Fiction",Tarantino,Genero.ACCION,fecha3);
        peliculas[3]= new Pelicula("Dunkerque",Nolan,Genero.BELICO,fecha4);
        peliculas[4]= new Pelicula("Indiana Jones",GeorgeLucas,Genero.FICCION,fecha5);
        peliculas[5]= new Pelicula("Star Wars IV",GeorgeLucas,Genero.COMEDIA,fecha6);
        peliculas[6]= new Pelicula("Mi Amigo el Gigante",Spielberg,Genero.ANIMACION,fecha7);
        peliculas[7]= new Pelicula("Vértigo",Hitctcock,Genero.CINENEGRO,fecha8);
        peliculas[8]= new Pelicula("El Bueno y el Malo",Spielberg,Genero.WESTERN,fecha9);
        peliculas[9]= new Pelicula("Grease",Tarantino,Genero.MUSICAL,fecha10);
        peliculas[10]= new Pelicula("Interestellar",Nolan,Genero.CIENCIAFICCION,fecha11);
        peliculas[11]= new Pelicula("Metropolis",Hitctcock,Genero.FANTASIA,fecha12);
        peliculas[12]= new Pelicula("La Forma del Agua",Spielberg,Genero.MELODRAMA,fecha13);
        peliculas[13]= new Pelicula("Casablanca",GeorgeLucas,Genero.POLICIACA,fecha14);
        peliculas[14]= new Pelicula("Kill Bill: Volumen 1",Tarantino,Genero.DRAMA,fecha15);
        peliculas[15]= new Pelicula("El Caballero Oscuro",Nolan,Genero.ACCION,fecha16);

        //AÑADIR PELICULAS AL VIDEOCLUB
        for (int i = 0; i < peliculas.length; i++) {
            videoclub.agregarPelicula(peliculas[i]);
        }
    }




    //PRUEBAS METODO 3
    @Test
    @DisplayName ("Prueba 1: OtraPeliDelDirector")
    void probarOtrasPelis(){
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(5));
        prueba.agregarPelicula(videoclub.getPeliculas().get(6));
        prueba.agregarPelicula(videoclub.getPeliculas().get(12));
        prueba.agregarPelicula(videoclub.getPeliculas().get(14));
        Pelicula esperada = prueba.otraPeliDelDirector(videoclub.getPeliculas().get(2));
        assertEquals(prueba.getPeliculas().get(4),esperada);
    }

    @Test
    @DisplayName("Prueba 2: OtraPeliDelDirector")
    void probarOtrasPelis2(){
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(5));
        prueba.agregarPelicula(videoclub.getPeliculas().get(6));
        prueba.agregarPelicula(videoclub.getPeliculas().get(12));
        prueba.agregarPelicula(videoclub.getPeliculas().get(14));
        Pelicula esperada = prueba.otraPeliDelDirector(videoclub.getPeliculas().get(2));
        assertNotEquals(prueba.getPeliculas().get(2),esperada);
    }

    @Test
    @DisplayName("Prueba 3: OtraPeliDelDirector")
    void probarOtrasPelis3(){
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(5));
        prueba.agregarPelicula(videoclub.getPeliculas().get(6));
        Pelicula esperada = prueba.otraPeliDelDirector(videoclub.getPeliculas().get(10));
        assertNotNull(esperada);
    }

    @Test
    @DisplayName("Prueba 4: OtraPeliDelDirector")
    void probarOtrasPelis4(){
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(5));
        prueba.agregarPelicula(videoclub.getPeliculas().get(6));
        Pelicula esperada = prueba.otraPeliDelDirector(videoclub.getPeliculas().get(3));
        assertNull(esperada);
    }

    @Test
    @DisplayName("Prueba 5: OtraPeliDelDirector")
    void probarOtrasPelis5(){
        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        Pelicula esperada = prueba.otraPeliDelDirector(videoclub.getPeliculas().get(3));
        assertNull(esperada);
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



//PRUEBAS METODO 6
@Test
@DisplayName("Prueba 1: sonIguales")//Ambas pelis son iguales.
void sonIguales1(){
    Director Tarantino = new Director("Tarantino");
    Fecha fecha1 = new Fecha(20, 4, 2004);
    Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
    Pelicula p2 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);

    assertTrue(p1.sonIguales(p2));
}

    @Test
    @DisplayName("Prueba 2: sonIguales")//Tienen diferente titulo por lo tanto no son iguales.
    void sonIguales2(){
        Director Tarantino = new Director("Tarantino");
        Fecha fecha1 = new Fecha(20, 4, 2004);
        Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
        Pelicula p2 = new Pelicula("Django", Tarantino, Genero.ACCION, fecha1);

        assertFalse(p1.sonIguales(p2));
    }

    @Test
    @DisplayName("Prueba 3: sonIguales")//Tienen diferente director por lo tanto no son iguales.
    void sonIguales3(){
        Director Tarantino = new Director("Tarantino");
        Director Spielberg = new Director("Spielberg");
        Fecha fecha1 = new Fecha(20, 4, 2004);
        Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
        Pelicula p2 = new Pelicula("Pulp Fiction", Spielberg, Genero.ACCION, fecha1);

        assertFalse(p1.sonIguales(p2));
    }

    @Test
    @DisplayName("Prueba 4: sonIguales")//Tienen diferente genero por lo tanto no son iguales.
    void sonIguales4(){
        Director Tarantino = new Director("Tarantino");
        Fecha fecha1 = new Fecha(20, 4, 2004);
        Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
        Pelicula p2 = new Pelicula("Pulp Fiction", Tarantino, Genero.DRAMA, fecha1);

        assertFalse(p1.sonIguales(p2));
    }

    @Test
    @DisplayName("Prueba 5: sonIguales")//Tienen diferente fecha por lo tanto no son iguales.
    void sonIguales5(){
        Director Tarantino = new Director("Tarantino");
        Fecha fecha1 = new Fecha(20, 4, 2004);
        Fecha fecha2 = new Fecha(7, 7, 2017);
        Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
        Pelicula p2 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha2);

        assertFalse(p1.sonIguales(p2));
    }

    @Test
    @DisplayName("Prueba 6: sonIguales")////Son totalmente distintas por lo tanto no son iguales.
    void sonIguales6(){
        Director Tarantino = new Director("Tarantino");
        Director Spielberg = new Director("Spielberg");
        Fecha fecha1 = new Fecha(20, 4, 2004);
        Fecha fecha2 = new Fecha(7, 7, 2017);
        Pelicula p1 = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha1);
        Pelicula p2 = new Pelicula("Django", Spielberg, Genero.ANIMACION, fecha2);

        assertFalse(p1.sonIguales(p2));
=======
    /*=========================Pruebas Método 1============================*/

    @Test
    @DisplayName("Prueba 1: CoincidenDirGen")
    void probarCoincidenDirGen1(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Tarantino));
    }

        @Test
    @DisplayName("Prueba 2: CoincidenDirGen")
    void probarCoincidenDirGen2(){
            Director Spielberg = new Director("Spielberg");
            Director Tarantino = new Director("Tarantino");
            Director Nolan = new Director("Nolan");
            Director GeorgeLucas = new Director("GeorgeLucas");
            Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 3: CoincidenDirGen")
    void probarCoincidenDirGen3(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 4: CoincidenDirGen")
    void probarCoincidenDirGen4(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Tarantino));
    }

    @Test
    @DisplayName("Prueba 5: CoincidenDirGen")
    void probarCoincidenDirGen5(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Tarantino));
    }

        @Test
    @DisplayName("Prueba 6: CoincidenDirGen")
    void probarCoincidenDirGen6(){
            Director Spielberg = new Director("Spielberg");
            Director Tarantino = new Director("Tarantino");
            Director Nolan = new Director("Nolan");
            Director GeorgeLucas = new Director("GeorgeLucas");
            Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 7: CoincidenDirGen")
    void probarCoincidenDirGen7(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 8: CoincidenDirGen")
    void probarCoincidenDirGen8(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Tarantino));
    }

    @Test
    @DisplayName("Prueba 9: CoincidenDirGen")
    void probarCoincidenDirGen9(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Tarantino));
    }

        @Test
    @DisplayName("Prueba 10: CoincidenDirGen")
    void probarCoincidenDirGen10(){
            Director Spielberg = new Director("Spielberg");
            Director Tarantino = new Director("Tarantino");
            Director Nolan = new Director("Nolan");
            Director GeorgeLucas = new Director("GeorgeLucas");
            Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 11: CoincidenDirGen")
    void probarCoincidenDirGen11(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 12: CoincidenDirGen")
    void probarCoincidenDirGen12(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " no coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Tarantino));
    }

    @Test
    @DisplayName("Prueba 13: CoincidenDirGen")
    void probarCoincidenDirGen13(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Tarantino));
    }

    @Test
    @DisplayName("Prueba 14: CoincidenDirGen")
    void probarCoincidenDirGen14(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 15: CoincidenDirGen")
    void probarCoincidenDirGen15(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.ACCION,Hitctcock));
    }

    @Test
    @DisplayName("Prueba 16: CoincidenDirGen")
    void probarCoincidenDirGen16(){
        Director Spielberg = new Director("Spielberg");
        Director Tarantino = new Director("Tarantino");
        Director Nolan = new Director("Nolan");
        Director GeorgeLucas = new Director("GeorgeLucas");
        Director Hitctcock = new Director("Hitctcock");

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals("El género de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.\nEl director de " + prueba.getPeliculas().get(0).getTitulo() + " coincide con el especificado.", prueba.coincidenDirGen((prueba.getPeliculas().get(0)),Genero.THRILLER,Tarantino));
>>>>>>> David-Branch
    }



<<<<<<< HEAD
//PRUEBAS METODO 8
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
=======
    /*=========================Pruebas Método 2============================*/

    @Test
    @DisplayName("Prueba 1: getPeliFromFecha")
    void probarGetPeliFromFecha(){

        Fecha fecha = new Fecha(20,20,2000);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        ArrayList<Pelicula>pelisFF = new ArrayList<>();
        pelisFF.add(prueba.getPeliculas().get(1));
        pelisFF.add(prueba.getPeliculas().get(2));
        pelisFF.add(prueba.getPeliculas().get(3));

        assertEquals(pelisFF,prueba.getPeliFromFecha(fecha));
    }

    @Test
    @DisplayName("Prueba 2: getPeliFromFecha")
    void probarGetPeliFromFecha2(){

        Fecha fecha = new Fecha(20,20,2000);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        ArrayList<Pelicula>pelisFF = new ArrayList<>();
        pelisFF.add(prueba.getPeliculas().get(0));
        pelisFF.add(prueba.getPeliculas().get(1));
        pelisFF.add(prueba.getPeliculas().get(2));
        pelisFF.add(prueba.getPeliculas().get(3));

        assertNotEquals(pelisFF,prueba.getPeliFromFecha(fecha));
    }

    @Test
    @DisplayName("Prueba 3: getPeliFromFecha")
    void probarGetPeliFromFecha3(){

        Fecha fecha = new Fecha(20,20,2020);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");
        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        ArrayList<Pelicula>pelisFF = new ArrayList<>();
        pelisFF.add(prueba.getPeliculas().get(0));
        pelisFF.add(prueba.getPeliculas().get(1));
        pelisFF.add(prueba.getPeliculas().get(2));
        pelisFF.add(prueba.getPeliculas().get(3));

        assertNotEquals(pelisFF,prueba.getPeliFromFecha(fecha));
    }

    /*=========================Pruebas Método 4============================*/

    @Test
    @DisplayName("Prueba 1: PelisSameGenre")
    void probarPelisSameGenre(){
        Pelicula p1 = new Pelicula(Genero.TERROR);
        Pelicula p2 = new Pelicula(Genero.WESTERN);
        Pelicula p3 = new Pelicula(Genero.FANTASIA);
        Pelicula p4 = new Pelicula(Genero.FICCION);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(0));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(8));

        assertFalse(prueba.peliSameGenre(p4));
    }

 @Test
    @DisplayName("Prueba 2: PelisSameGenre")
    void probarPelisSameGenre2(){

        Pelicula p1 = new Pelicula(Genero.TERROR);
        Pelicula p2 = new Pelicula(Genero.WESTERN);
        Pelicula p3 = new Pelicula(Genero.FANTASIA);
        Pelicula p4 = new Pelicula(Genero.FICCION);

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(p1);
        prueba.agregarPelicula(videoclub.getPeliculas().get(0));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(8));

        assertTrue(prueba.peliSameGenre(p1));

    }

    /*=========================Pruebas Método 7============================*/

    @Test
    @DisplayName("Prueba 1: getAntig")
    void probarGetAntig(){

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals(12, prueba.getAntig(prueba.getPeliculas().get(2)));
    }

    @Test
    @DisplayName("Prueba 2: getAntig")
    void probarGetAntig2(){

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals(10, prueba.getAntig(prueba.getPeliculas().get(2)));
    }

@Test
    @DisplayName("Prueba 3: getAntig")
    void probarGetAntig3(){

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertEquals(28, prueba.getAntig(prueba.getPeliculas().get(0)));
    }

@Test
    @DisplayName("Prueba 4: getAntig")
    void probarGetAntig4(){

        VideoclubOnline prueba = new VideoclubOnline("Prueba");

        prueba.agregarPelicula(videoclub.getPeliculas().get(1));
        prueba.agregarPelicula(videoclub.getPeliculas().get(2));
        prueba.agregarPelicula(videoclub.getPeliculas().get(3));
        prueba.agregarPelicula(videoclub.getPeliculas().get(4));

        assertNotEquals(30, prueba.getAntig(prueba.getPeliculas().get(0)));
    }


>>>>>>> David-Branch
}
