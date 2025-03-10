import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 *Rettangolo 
 *
 */
public class Main {
    public static void main(String[] args) {

        try {
            Rettangolo r1 = new Rettangolo(3,2);
            System.out.println(r1.toString());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Argomento passato incorrettamente");
        }
    }
}