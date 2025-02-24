/**
*Esercizio 4.1
*ArrayPrimi
*
*@author Liam Panarisi
*@version 10.02.2025
*/

public class ArrayPrimi{
	public static void main(String[] args){
		int [] numeri = {2,4,4,5,6,7,8,9};
		int conto = 0; 
		int resto = 0;
		for (int num : numeri) {
			for (int i = 2; i < numeri.length; i++){
				int b = num % i;
				if (b != 0){
				System.out.print(b + " ");
				conto++;
				}
			}
		}
		System.out.println("\nNumero di numeri primi " + conto);
	}
}