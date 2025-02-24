//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String car = args[2];
        String piu = "+";
        String meno  = "-";
        String per  = "*";
        String diviso = "/";
        if (car.equals(piu)) {
            System.out.println("Funziona piu");
            System.out.println(num1 + num2);
        }
        if (car.equals(meno)) {
            System.out.println("Funziona meno");
            System.out.println(num1 - num2);
        }
        if (car.equals(per)) {
            System.out.println("Funziona per");
            System.out.println(num1 * num2);
        }
        if (car.equals(diviso)) {
            System.out.println("Funziona diviso");
            System.out.println(num1 / num2);
        }
    }
}