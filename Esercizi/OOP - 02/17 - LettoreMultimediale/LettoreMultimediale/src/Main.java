import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Brano brano1 = new Brano("Re limone", "Massard");
        Brano brano2 = new Brano("Attacco", "Cetaj");
        ArrayList<Brano> branos = new ArrayList<Brano>();
        Playlist playlist1 = new Playlist("Playlist 1");
        System.out.println(playlist1.toString());
    }
}