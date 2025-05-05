import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MorseEntry> entries = new ArrayList<>();
        FileManager fileManager = new FileManager("morse_output.txt");

        try {
            System.out.print("Inserisci un testo da convertire in Morse: ");
            String input = scanner.nextLine();
            String morse = MorseConverter.toMorse(input);

            MorseEntry entry = new MorseEntry(input, morse);
            entries.add(entry);

            System.out.println("Traduzione: " + morse);

            fileManager.writeEntries(entries);
            fileManager.readEntries();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
