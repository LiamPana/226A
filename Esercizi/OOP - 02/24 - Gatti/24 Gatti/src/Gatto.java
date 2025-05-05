public class Gatto {
    private String nome;
    private int Anni;
    private String tipologia;
    public Gatto(String nome, int Anni, String tipologia) {
        this.nome = nome;
        this.Anni = Anni;
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + nome + '\'' +
                ", Anni=" + Anni +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }
}
