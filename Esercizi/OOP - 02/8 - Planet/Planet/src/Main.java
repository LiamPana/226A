//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
*Esercizio 5
*Planet
*
*@author Liam Panarisi
*@version 16.03.2025
*/
public class Main {
    public static void main(String[] args) {
        try{
        Planet p1 = new Planet("Terra",5.9*10E24 ,6.6*10E19, 5.51,  6378, true, 8E9, false, 0.29 );
        System.out.println(p1.toString());
        Planet p2 = new Planet("Giove",1.89*10e27 ,1.43*10e15, 1.326,  71492, false, 0, true, 0.34 );
        System.out.println(p2.toString());
        Planet p3 = new Planet("Marte",6.39*10e23 ,1.63*10e11, 3.93,  3389, false, 0, false, 0.4 );
        System.out.println(p3.toString());

        }

        catch (IllegalArgumentException e){
            System.out.println("Argomento passato incorrettamente");
        }




    }
}
