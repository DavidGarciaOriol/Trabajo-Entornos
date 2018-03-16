public class Main {
    public static void main(String[] args) {
        //VIDEOCLUB
        VideoclubOnline videoclub = new VideoclubOnline("PacoClub");
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
        Pelicula p1 = new Pelicula("Poltergeist", Spielberg, Genero.TERROR, fecha);
        Pelicula p2 = new Pelicula("Poltergeist", Spielberg, Genero.TERROR, fecha);
        Pelicula[] peliculas = new Pelicula[16];
        peliculas[0] = new Pelicula("Poltergeist", Spielberg, Genero.TERROR, fecha);
        peliculas[1] = new Pelicula("Psicosis", Hitctcock, Genero.THRILLER, fecha2);
        peliculas[2] = new Pelicula("Pulp Fiction", Tarantino, Genero.ACCION, fecha3);
        peliculas[3] = new Pelicula("Dunkerque", Nolan, Genero.BELICO, fecha4);
        peliculas[4] = new Pelicula("Indiana Jones", GeorgeLucas, Genero.FICCION, fecha5);
        peliculas[5] = new Pelicula("Star Wars IV", GeorgeLucas, Genero.COMEDIA, fecha6);
        peliculas[6] = new Pelicula("Mi Amigo el Gigante", Spielberg, Genero.ANIMACION, fecha7);
        peliculas[7] = new Pelicula("Vértigo", Hitctcock, Genero.CINENEGRO, fecha8);
        peliculas[8] = new Pelicula("El Bueno y el Malo", Spielberg, Genero.WESTERN, fecha9);
        peliculas[9] = new Pelicula("Grease", Tarantino, Genero.MUSICAL, fecha10);
        peliculas[10] = new Pelicula("Interestellar", Nolan, Genero.CIENCIAFICCION, fecha11);
        peliculas[11] = new Pelicula("Metropolis", Hitctcock, Genero.FANTASIA, fecha12);
        peliculas[12] = new Pelicula("La Forma del Agua", Spielberg, Genero.MELODRAMA, fecha13);
        peliculas[13] = new Pelicula("Casablanca", GeorgeLucas, Genero.POLICIACA, fecha14);
        peliculas[14] = new Pelicula("Kill Bill: Volumen 1", Tarantino, Genero.DRAMA, fecha15);
        peliculas[15] = new Pelicula("El Caballero Oscuro", Nolan, Genero.ACCION, fecha16);
        //AÑADIR PELICULAS AL VIDEOCLUB
        for (int i = 0; i < peliculas.length; i++) {
            videoclub.agregarPelicula(peliculas[i]);
        }

        System.out.println(videoclub.hayVariedad());
    }
}
