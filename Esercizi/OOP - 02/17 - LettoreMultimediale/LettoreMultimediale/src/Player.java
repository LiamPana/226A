import java.util.Objects;

public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    private int selezione;

    public Player(String modello, String marca, Playlist playlist, int selezione) {
        if (modello.isEmpty() || marca.isEmpty() || playlist.getBrani().isEmpty()) {
            throw new NullPointerException("Argomenti nulli");
        } else {
            this.modello = modello;
            this.marca = marca;
            this.playlist = playlist;
            this.selezione = 0;
        }

    }

    public Playlist getPlaylist() {

        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        if (!playlist.getBrani().isEmpty()) {
            throw new NullPointerException("Argomenti nulli");
        } else {
            this.playlist = playlist;
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            throw new NullPointerException("Argomenti nulli");
        }else {
            this.marca = marca;
        }
    }

    public String getModello() {
        return modello;
    }


    public void setModello(String modello) {
        if (!modello.isEmpty()) {
            throw new NullPointerException("Argomenti nulli");
        }else {
            this.modello = modello;
        }
    }

    public int getSelezione() {
        return selezione;
    }

    public void setSelezione(int selezione) {
        if (selezione < 0) {
            throw new NullPointerException("Traccia negativa ERROR");
        } else {
            this.selezione = selezione;
        }
    }

    public void Play() {
        String testo = getPlaylist().getBrani().get(getSelezione()).toString();
        System.out.println(testo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return selezione == player.selezione && Objects.equals(modello, player.modello) && Objects.equals(marca, player.marca) && Objects.equals(playlist, player.playlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modello, marca, playlist, selezione);
    }

    @Override
    public String toString() {
        return "Player{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", playlist=" + playlist +
                ", selezione=" + selezione +
                '}';
    }
}
