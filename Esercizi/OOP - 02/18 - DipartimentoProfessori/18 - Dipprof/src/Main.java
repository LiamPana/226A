public class Main {
    public static void main(String[] args) {

        Professore p1 = new Professore("Mattia", 1);
        Professore p2 = new Professore("Negro", 2);
        Professore p3 = new Professore("paolo", 3);

        Dipartimento d1 = new Dipartimento("Cucina");


        d1.AddProf(p1);
        d1.AddProf(p2);
        d1.AddProf(p3);
        d1.listProf();

        Professore p4 = new Professore("Mooo", 4);
        d1.AddProf(p4);
        d1.listProf();
        d1.RemoveProf(p4);
        d1.listProf();



    }
}