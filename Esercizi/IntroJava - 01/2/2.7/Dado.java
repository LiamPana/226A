/**
*Esercizio 2.7
*Programma simula un lancio di un dado
*
*@author Liam Panarisi
*@version 03.02.2025
*/
import java.util.Random; //importare libreria random
public class Dado {
	public static void main(String[] args){
		Random rnd = new Random();
		int face = rnd.nextInt(1,7); // min incluso e max escluso 1,7
		
		System.out.println(face);
	}
	
		
}