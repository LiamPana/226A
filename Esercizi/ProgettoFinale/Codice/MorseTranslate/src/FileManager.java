import java.io.*;
import java.util.ArrayList;

/**
 *
 *  @author Liam Panarisi
 *  @version maggio 2025
 */
public class FileManager {
    /**
     * @param nomeFile nome del file in cui si salvano i codici
     */
    private final String nomeFile;

    public FileManager(String nomeFile) {
        if (nomeFile == null) {throw new NullPointerException("nomeFile is null");}
       else {this.nomeFile = nomeFile;}}

    public void writeEntries(ArrayList<MorseEntry> entries) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile, true))) {
            for (MorseEntry entry : entries) {
                writer.write(entry.toString());
                writer.newLine();
            }
        }
    }

    public void readEntries() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            System.out.println("Contenuto del file:");
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
        }
    }
}

