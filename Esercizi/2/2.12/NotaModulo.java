/**
*Esercizio 2.12
*NotaModulo
*
*@author Liam Panarisi
*@version 03.02.2025
*/
public class NotaModulo {
	public static void main(String[] args){
		double nota1 = Double.parseDouble (args[0]);
		double nota2 = Double.parseDouble (args[1]);
		double nota3 = Double.parseDouble (args[2]);
		double nota4 = Double.parseDouble (args[3]);
		double notaFinale = nota1 * 0.10 + nota2 * 0.30 + nota3 * 0.30 + nota4 * 0.30;
		System.out.println(notaFinale);
		
		
		
	}
}