public class Punto {
    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto() {
        this.x = 1.0;
        this.y = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcolaDistanza(){
        return Math.sqrt(x*x + y*y);
    }

    public String determinaQuadrante(){
        if (x > 0 && y > 0){
            return "Siamo nel primo quadrante";
        } else if (x < 0 && y > 0){
            return "Siamo nel secondo quadrante";

        }else if (x < 0 && y < 0) {
            return "Siamo nel terzo quadrante";
        }else if (x > 0 && y < 0) {
            return "Siamo nel quarto quadrante";
        } else{
            return "";
        }
    }




    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")" + "\n"+calcolaDistanza() + "\n"+ determinaQuadrante();
    }


}
