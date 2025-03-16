public class Planet {
    String name;
    double mass;
    double volume;
    double density;
    int radius;
    boolean life;
    double population;
    boolean gasGiant;
    double albedo;

    public Planet(String name, double mass, double volume, double density, int radius, boolean life, double population, boolean gasGiant, double albedo ){
        if (mass > 0 &&  volume > 0 && density > 0 && radius > 0){
            this.name = name;
            this.mass = mass;
            this.volume = volume;
            this.density = density;
            this.radius = radius;
            this.life = life;
            this.population = population;
            this.albedo = albedo;
        }else {
            System.out.println("Dati incorretti");

        }

    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensity() {
        return density;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isLife() {
        return life;
    }

    public double getPopulation() {
        return population;
    }

    public boolean isGasGiant() {
        return gasGiant;
    }

    public double isAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }

    public void setGasGiant(boolean gasGiant) {
        this.gasGiant = gasGiant;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float Accellerazione(){
        double G = 9.81;
        double g = (G * mass)/ Math.pow(radius, 2);
        return (float)g;
    }

    @Override
    public String toString() {
        return "Dati pianeta; \n" +
                "Nome: "+ name +"\n" +
                "Massa: " + mass + "\n" +
                "Volume: " + volume + "\n" +
                "Densità (g/cm^3): "+ density + "\n" +
                "Raggio: " + radius + "\n" +
                "Vita: " + life + "\n" +
                "Populazione: " + population + "\n" +
                "Gigante Gassoso: " + gasGiant +"\n"+
                "Riflettente: " + albedo + "\n"
                + "Accellerazione: " + Accellerazione() +"\n"+
                "*******************************************************";

    }
}
