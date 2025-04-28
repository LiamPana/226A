public class Impiegato {
    private String nome;
    private String cognome;
    private int dataNascita;
    private int identificativo;
    public Impiegato(String nome, String cognome, int dataNascita) {
        if (nome.isEmpty() || cognome.isEmpty() || dataNascita < 0 || identificativo < 0) {}
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;

    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;

    }
    public int getDataNascita() {
        return dataNascita;
    }
    public void setDataNascita(int dataNascita) {
        this.dataNascita = dataNascita;
    }

}
