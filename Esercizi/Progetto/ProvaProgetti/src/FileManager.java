import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
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

