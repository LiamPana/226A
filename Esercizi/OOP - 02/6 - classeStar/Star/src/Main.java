//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
             Star star1 = new Star();
        star1.name = "Sun";
        star1.luminosity = 3.28E26;
        star1.mass= 1.9885E30;
        star1.volume= 1.41E18;
        star1.age = 4.6E9;
        System.out.println(star1.toString());
    }
        catch (IllegalArgumentException iae){
            System.out.println("Controlla il tipo di dati");
        }


    }
}