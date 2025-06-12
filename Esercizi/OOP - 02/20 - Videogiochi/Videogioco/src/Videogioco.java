import java.util.ArrayList;
import java.util.List;

public class Videogioco {
    private String titolo;
    private List<Sviluppatore> sviluppatori = new ArrayList<>();
    private float prezzo;
    private boolean stato;

    public Videogioco(String titolo, float prezzo, boolean stato) {
        if (titolo.isEmpty() || prezzo < 0 ){
            throw new NullPointerException("Valori vuoti o sbagliati");
        }else{
            this.titolo = titolo;
            this.prezzo = prezzo;
            this.stato = stato;
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public void aggiungiSvil(Sviluppatore sviluppatore){
        sviluppatori.add(sviluppatore);
    }
    public void rimuoviSvil(Sviluppatore sviluppatore){
        sviluppatori.remove(sviluppatore);
    }
}
