import java.util.ArrayList;
import java.util.Formatter;

public class Dipartimento {
    private String nome;
    private int numeroProfessori;
    private ArrayList<Professore> professori;

    public Dipartimento(String nome) {
        this.nome = nome;
        this.professori = new ArrayList<>();
    }

    public ArrayList<Professore> getProfessori() {
        return professori;
    }

    public void setProfessori(ArrayList<Professore> professori) {
        this.professori = professori;
    }

    public int getNumeroProfessori() {
        return numeroProfessori;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void AddProf(Professore professore){
        professori.add(professore);
        String messaggio = String.format("Professore %s aggiunto con successo", professore.getNome());
        System.out.println(messaggio);
        numeroProfessori++;
    }
    public void RemoveProf(Professore professore){
        professori.remove(professore);
        numeroProfessori--;
    }
    public void listProf(){
        System.out.println("");
        System.out.println("****************Lista Professori****************");
        for (Professore professore : professori) {
            System.out.println(professore);
        }
        System.out.println("************************************************");
        System.out.println("");
    }

}
