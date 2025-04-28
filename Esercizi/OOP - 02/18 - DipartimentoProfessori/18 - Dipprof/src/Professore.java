public class Professore {
    private String nome;
    private int id;

    public Professore(String nome, int id) {
        if (nome.isEmpty() || id < 0){
            throw  new NullPointerException("attributi nulli");

        }
        else {
            this.nome = nome;
            this.id =id;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            this.nome = "Sconosciuto";
        } else {
            this.nome = nome;
        }
    }
    public int getID() {
        return id;
    }

    public void setID(int id) {
        if (id < 0) {
            throw new NullPointerException("id negativo non ammesso");

        } else {
            this.id = id;
        }
    }

    @Override
    public String toString() {
        return "Professore{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
