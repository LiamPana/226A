public class Rettangolo {
    int latoMaggiore;
    int latoMinore;

    public Rettangolo(int latoMaggiore, int latoMinore) {

        if (latoMaggiore > latoMinore  && latoMinore >0 ){
            this.latoMaggiore = latoMaggiore;
            this.latoMinore = latoMinore;
        }else{
            this.latoMaggiore = 7;
            this.latoMinore = 5;
        }
    }
    public Rettangolo(){
        this.latoMaggiore = 7;
        this.latoMinore = 5;
    }

    public int getLatoMaggiore() {
        return latoMaggiore;
    }
    public void setLatoMaggiore(int latoMaggiore) {
        if(latoMaggiore > latoMinore && latoMinore >0 ){
            this.latoMaggiore = latoMaggiore;
        }

    }
    public int getLatoMinore() {
        return latoMinore;

    }
    public void setLatoMinore(int latoMinore) {
        if(latoMinore < latoMaggiore && latoMinore >0 ){
            this.latoMinore = latoMinore;
        }


    }
    public int getArea(){
        int Area = latoMinore * latoMaggiore;
        return Area;
    }
    public int getPerimetro(){
        int Perimetro = (latoMinore + latoMaggiore)*2;
        return Perimetro;
    }
    public int getDiagonale(){
        double Diagonale = Math.sqrt(Math.pow(latoMinore, 2) + Math.pow(latoMaggiore, 2));
        return (int)Diagonale;
    }

    @Override
    public String toString() {
        return "Rettangolo" +
                "latoMaggiore=" + latoMaggiore +
                ", latoMinore=" + latoMinore +
                "\nArea= " + getArea() +"\nPerimetro= " + getPerimetro()
                + "\nDiagonale= " + getDiagonale();
    }
}
