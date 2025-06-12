import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String nome;
    private List<Videogioco> giochi = new ArrayList<>();



    public Negozio(String nome) {
        if (nome.isEmpty()) {
            throw new NullPointerException("Valori vuoti o sbagliati");
        } else {
            this.nome = nome;
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiVideogioco(Videogioco videogioco){
        giochi.add(videogioco);
    }
    public void rimuoviVideogioco(Videogioco videogioco){
        giochi.remove(videogioco);
    }
    public void tuttiVideogiochi(){
        for (Videogioco a : giochi) {
            System.out.println(a.getTitolo());
        }
    }

}
