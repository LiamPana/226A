/**
 *
 * @author Liam Panarisi
 * @version Marzo 2025
 * Salva una sede nell'oggetto sede1,
 * un veicolo nell'oggetto veicolo1
 * e un autista nell'oggetto autista1.
 *
 *
 * */
public class Main {
    public static void main(String[] args) {

        try {

            Sede sede1 = new Sede(5520, "Aldo Moro", "0799563124");
            Veicolo veicolo1 = new Veicolo("M3 Competition", "BMW", "TI69104");
            Autista autista1= new Autista("Gianluca", "Zambetti", veicolo1, sede1);
            System.out.println(autista1);
        }
        catch (NullPointerException e){
            System.out.println("Un valore inserito è nullo");


        }
        catch (IllegalArgumentException u){
            System.out.println("Argomento non possibile inserito");
        }



    }
}