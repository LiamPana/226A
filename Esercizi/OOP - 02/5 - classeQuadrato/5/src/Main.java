/**
*Esercizio 5
*Quadrato
*Inserisci i parametri del quadrato. (Ho fatto il possibile ma intellij ha avuto dei problemi nella compilazione e non sono riuscito a far andare il programma)
*@author Liam Panarisi
*@version 09.03.2025
**/
public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(3);
        Square square3 = new Square(-2); // Deve tornare a 5 per via del controllo

        System.out.println(square1.getDimension());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimetro: " + square1.getPerimeter());
        square1.draw();

        System.out.println();

        System.out.println(square2.getDimension());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimetro: " + square2.getPerimeter());
        square2.draw();

        System.out.println();

        System.out.println(square3.getDimension());
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimetro: " + square3.getPerimeter());
        square3.draw();
    }
}
