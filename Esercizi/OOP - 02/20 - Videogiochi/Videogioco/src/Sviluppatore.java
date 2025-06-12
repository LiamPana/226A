public class Sviluppatore {
    private String nome;

    public Sviluppatore(String nome) {
        if(nome.isEmpty()){
            throw new NullPointerException("Nome vuoto");

        }else{this.nome = nome;}


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sviluppatore{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
