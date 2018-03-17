import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class PruebasM6 {
    
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
    }
}
