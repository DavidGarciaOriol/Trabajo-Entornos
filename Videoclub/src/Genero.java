public enum Genero{
        TERROR("Terror"),
        COMEDIA("Comedia"),
        ROMANCE("Romance"),
        THRILLER("Thriller"),
        POLICIACA("Policiaca"),
        FICCION("Ficción"),
        CIENCIAFICCION("Ciencia-Ficción"),
        CINENEGRO("Cine-Negro"),
        BELICO("Bélico"),
        MUSICAL("Musical"),
        FANTASIA("Fantasía"),
        MELODRAMA("Melodrama"),
        DRAMA("Drama"),
        WESTERN("Western"),
        ACCION("Acción"),
        ANIMACION("Animación")
        ;
        String genero;
         Genero(String gen){
            genero = gen;
        }

        public String getGenero() {
            return genero;
        }
    }

