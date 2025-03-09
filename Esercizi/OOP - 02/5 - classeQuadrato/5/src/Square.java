class Square {
    public Integer side;
    private static final int DEFAULT_SIZE = 5;

    // Costruttore vuoto con dimensione di default
    public Square() {
        this.side = DEFAULT_SIZE;
    }

    // Costruttore con controllo
    public Square(int side) {
        if (side > 0) {
            this.side = side;
        } else {
            this.side = DEFAULT_SIZE;
        }
    }

    // Metodo per calcolare l'area
    public int getArea() {
        return side * side;
    }

    // Metodo per calcolare il perimetro
    public int getPerimeter() {
        return 4 * side;
    }

    // Metodo per disegnare il quadrato
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Metodo per ottenere una descrizione testuale
    public String getDimension() {
        return "Quadrato " + side + " x " + side;
    }
}
