import java.util.Objects;

public class Figurine {
    private String idFigurina;
    private String nomeGiocatore;
    private String stagione;

    public Figurine(String idFigurina, String nomeGiocatore, String stagione) {
        this.idFigurina = idFigurina;
        this.nomeGiocatore = nomeGiocatore;
        this.stagione = stagione;
    }

    public String getIdFigurina() {
        return idFigurina;
    }

    public void setIdFigurina(String idFigurina) {
        this.idFigurina = idFigurina;
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }

    public String getStagione() {
        return stagione;
    }

    public void setStagione(String stagione) {
        this.stagione = stagione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figurine figurine = (Figurine) o;
        return Objects.equals(idFigurina, figurine.idFigurina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFigurina, nomeGiocatore, stagione);
    }
}
