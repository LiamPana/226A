import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserire coordinata riga [0;4]: ");
        int x = in.nextInt();
        System.out.print("Inserire coordinata colonna [0;4]: ");
        int y = in.nextInt();
        Coordinator c1 = new Coordinator(x, y);

        if (x < 0 && y < 0 || x > 5 && y > 5){
            System.out.println("I VALORI CHE HAI INSERITO SONO MINORI DI 0 ");
        }else{
            System.out.println(c1.toString());
        }



    }
}