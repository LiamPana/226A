import java.io.*;
import java.util.ArrayList;

/**
 *
 *  @author Liam Panarisi
 *  @version maggio 2025
 */
public class FileManager {
    /**
     * @param fileName nome del file in cui si salvano i codici
     */
    private final String fileName;

    public FileManager(String fileName) {
        if (fileName == null) {
            throw new NullPointerException("fileName is null");
        }else {
        this.fileName = fileName;
        }
    }

    public void writeEntries(ArrayList<MorseEntry> entries) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (MorseEntry entry : entries) {
                writer.write(entry.toString());
                writer.newLine();
            }
        }
    }

    public void readEntries() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contenuto del file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

