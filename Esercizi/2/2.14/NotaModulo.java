/**
*Esercizio 2.14
*Nota Modulo
*Calcola con i suoi pesi la nota della materia.
*@author Liam Panarisi
*@version 16.02.2025
**/
public class NotaModulo {
	public static void main(String[] args){
		float nota1 = Float.parseFloat(args[0]);
		float nota2 = Float.parseFloat(args[1]);
		float nota3 = Float.parseFloat(args[2]);
		float nota4 = Float.parseFloat(args[3]);
		double risultato = (nota1 * 0.10) + (nota2 * 0.3) + (nota3 * 0.3) + (nota4 * 0.3);
		System.out.println("La tua media è: " + risultato);
	}
}