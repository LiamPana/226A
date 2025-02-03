/**
*Esercizio 2.11
*Codice
*
*@author Liam Panarisi
*@version 03.02.2025
*/
public class Codice {
	public static void main(String[] args){
	String parola = args[0];
	int dim = parola.length();
	String s1 = parola.substring(0,1);
	String s2 = parola.substring(2,3);
	String s3 = parola.substring(dim-1,dim);
	String s4 = parola.substring(dim-2,dim-1);
	String codice = s1+s2+s3+s4;
	System.out.println(codice);
	
	}
}


