import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * Applicativo per la traduzione da caratteri a codice Morse
 *
 * @author Liam Panarisi
 * @version Maggio 2025
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "morse_output.txt";
        FileManager fileManager = new FileManager(filename);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Traduci testo in Morse");
            System.out.println("2. Elimina file");
            System.out.println("3. Rinomina file");
            System.out.println("4. Crea nuovo file (sovrascrivi)");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            String choice = scanner.nextLine();


            try {
                switch (choice) {
                    case "1":
                        System.out.print("Inserisci un testo da convertire in Morse: ");
                        String input = scanner.nextLine();
                        String morse = MorseConverter.toMorse(input);
                        MorseEntry entry = new MorseEntry(input, morse);
                        ArrayList<MorseEntry> entries = new ArrayList<>();
                        entries.add(entry);
                        System.out.println("Traduzione: " + morse);
                        fileManager.writeEntries(entries);
                        fileManager.readEntries();
                        break;

                    case "2":
                        File fileToDelete = new File(filename);
                        if (fileToDelete.exists() && fileToDelete.delete()) {
                            System.out.println("File eliminato con successo.");
                        } else {
                            System.out.println("Impossibile eliminare il file.");
                        }
                        break;

                    case "3":
                        System.out.print("Inserisci il nuovo nome del file: ");
                        String newName = scanner.nextLine();
                        File oldFile = new File(filename);
                        File newFile = new File(newName);
                        if (oldFile.exists() && oldFile.renameTo(newFile)) {
                            System.out.println("File rinominato in: " + newName);
                            filename = newName;
                            fileManager = new FileManager(filename);
                        } else {
                            System.out.println("Impossibile rinominare il file.");
                        }
                        break;

                    case "4":
                        File newCreatedFile = new File(filename);
                        if (newCreatedFile.createNewFile() || newCreatedFile.exists()) {
                            System.out.println("Nuovo file creato/sovrascritto: " + filename);
                        } else {
                            System.out.println("Errore nella creazione del file.");
                        }
                        break;

                    case "5":
                        System.out.println("Uscita dal programma.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Scelta non valida.");
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}
