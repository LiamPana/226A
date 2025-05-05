import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gatto> gatti = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("ListaGatti.txt");
        try {
            lines = Files.readAllLines(path);
        }catch (IOException ex) {
            System.out.println("Errore nella lettura del file!");
        }
        for (String l : lines) {
            String[] tokens = l.split(",");
            gatti.add(new Gatto(tokens[0],Integer.parseInt(tokens[1]) ,tokens[2]));
        }

        for (Gatto g : gatti) {
            System.out.println(g);
        }
    }
}
