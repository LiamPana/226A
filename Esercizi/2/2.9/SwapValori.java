/**
*Esercizio 2.9
*Swap Valori
*
*@author Liam Panarisi
*@version 03.02.2025
*/
public class SwapValori {
	public static void main(String[] args){
		int varA = Integer.parseInt(args[0]);
		int varB = Integer.parseInt(args[1]);
		int swap = 0;
		swap = varA;
		varA = varB;
		varB = swap;
		System.out.println(varA +" "+ varB);
	}
}