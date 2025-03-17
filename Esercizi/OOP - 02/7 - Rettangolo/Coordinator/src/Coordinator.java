public class Coordinator {
    private int coordX;
    private int coordY;

    public Coordinator(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public int getCoordX() {
        return coordX;
    }
    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        if (coordX > 0 && coordX < 5){
        this.coordX = coordX;
        }else{
            this.coordX = 0;
        }
    }

    public void setCoordY(int coordY) {
        if (coordY > 0 && coordY < 5){
            this.coordY = coordY;
        }else{
            this.coordY = 0;
        }
    }

    public void Cartesiano(){
        while(true){
            System.out.println();
        }
    }


}
