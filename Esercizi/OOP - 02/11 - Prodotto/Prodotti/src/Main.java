/**
 *  La classe Main ha importato Scanner per poter utilizzare l'input.
 *  Il programma serve per modificare la quantità ed il prezzo totale di un prodotto.
 *
 * @author Liam Panarisi
 * @version Marzo 2025
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prodotto cioccolato = new Prodotto("Cioccolato",120,5,30);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aggiorna quantità: ");
        try{
            int quantita = scanner.nextInt();
            cioccolato.aggiornaQuantita(quantita);
            System.out.println(cioccolato);

        }catch(InputMismatchException i){
            System.out.println("Inserire solo valori numerici");
        }catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }finally {
            scanner.close();
        }
    }
}