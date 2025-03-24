public class Autista {
    private String nome;
    private String cognome;
    private Veicolo auto;
    private Sede sede;

    public Autista(String nome, String cognome, Veicolo auto,Sede sede) {
        if (nome.isEmpty() || cognome.isEmpty()){
            throw new NullPointerException("Nome and cognome are null!");
        }else{
            this.nome = nome;
            this.cognome = cognome;
            this.sede = sede;
            this.auto = auto;
        }


    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Veicolo getAuto() {
        return auto;
    }

    public void setAuto(Veicolo auto) {
        this.auto = auto;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autista{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", auto=" + auto +
                ", sede=" + sede +
                '}';
    }
}
