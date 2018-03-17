import java.util.GregorianCalendar;

    public class Fecha extends GregorianCalendar {
        public Fecha(int dia, int mes, int year){
            super(year,mes,dia);
        }

        public Fecha(int dia, int mes, int year, int hora, int min){
            super(year,mes,dia,hora,min);
        }



        public Fecha(){
            super();
        }

        @Override
        public String toString() {
            return this.getTime().toString();
        }
    }
