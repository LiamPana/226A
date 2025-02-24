/**

*
*
*
*/
public class Pitagora {
	public static void main(String[] args){
			float cat1 = Integer.parseInt(args[0]);
			float cat2 = Integer.parseInt(args[1]);
			double pitagora = Math.sqrt(cat1*cat1 + cat2*cat2);
			
			System.out.println(pitagora);
			
	}
}