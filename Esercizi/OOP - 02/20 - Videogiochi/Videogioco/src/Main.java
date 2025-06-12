import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        Videogioco v1 = new Videogioco("Mario Kart", 99, true );
        Videogioco v2 = new Videogioco("Mario Party", 49, false );
        Videogioco v3 = new Videogioco("Mario Skater", 59, true );

        Negozio n1 = new Negozio("Game stop");
        Negozio n2 = new Negozio("MediaMarkt");

        Sviluppatore s1 = new Sviluppatore("Peretti");
        Sviluppatore s2 = new Sviluppatore("Palucci");
        Sviluppatore s3 = new Sviluppatore("Mussi");
        Sviluppatore s4 = new Sviluppatore("Gaiero");

        try {
            n1.aggiungiVideogioco(v1);
            n1.aggiungiVideogioco(v2);
            n1.aggiungiVideogioco(v3);

            n1.tuttiVideogiochi();


            n1.rimuoviVideogioco(v2);
            n1.tuttiVideogiochi();
        } catch (NullPointerException e){
            System.out.println("Errore");
        }









    }
}