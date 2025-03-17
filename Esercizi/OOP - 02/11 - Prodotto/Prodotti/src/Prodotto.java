public class Prodotto {
    private String nome;
    private int codice;
    private int quantita;
    private int prezzo;

    public Prodotto(String nome, int codice, int quantita, int prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.isEmpty() ){
            throw new IllegalArgumentException("Nome non puo' essere vuoto");

        }

        this.nome = nome;
    }
    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public int getQuantita() {
        return quantita;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiornaQuantita(int quantita) {
        this.quantita -= this.quantita - quantita;
    }
    public double calcolaValoreTotale() {
        double totale = quantita * prezzo;
        return totale;

    }

    @Override
    public String toString() {
        return "Scheda prodotto; \n" + nome
                + "\n*********\n"
                + "Codice: " + codice + "\n"
                + "Quantita disponibile: " + quantita + "\n"
                + "Prezzo unitario: " + prezzo + "\n"
                + "Valore totale: " + calcolaValoreTotale();
    }
}
