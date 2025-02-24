/*
* Titolo: Cambia arrays
* Autore: Liam Panarisi
*
* */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessun argomento passato.");
            return;
        }

        // Stampa gli argomenti
        System.out.println("Stampa di args = " + String.join(" ", args));

        // Creazione e ordinamento dell'array
        String[] arrayOrdinata = Arrays.copyOf(args, args.length);
        Arrays.sort(arrayOrdinata);

        // Stampa il contenuto dell'array ordinato
        System.out.println("Array:");
        for (String s : arrayOrdinata) {
            System.out.println(s);
        }
    }
}
