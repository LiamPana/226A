import java.util.ArrayList;
import java.util.Objects;

public class Playlist {
    private String titolo;
    private  ArrayList <Brano> brani;
    public Playlist(String titolo) {
        if (titolo.isEmpty() || brani.isEmpty()) {

        }
        this.titolo = titolo;
        brani = new ArrayList<>();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public ArrayList<Brano> getBrani() {
        return brani;
    }

    public void setBrani(ArrayList<Brano> brani) {
        this.brani = brani;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(titolo, playlist.titolo) && Objects.equals(brani, playlist.brani);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, brani);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "titolo='" + titolo + '\'' +
                ", brani=" + brani +
                '}';
    }

}
