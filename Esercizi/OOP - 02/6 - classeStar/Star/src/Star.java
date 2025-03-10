public class Star {
    String name;
    double luminosity;
    double mass;
    double volume;
    double age;
    
    public Star(String name, double luminosity, double mass, double volume, double age) {
        this.name = name;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }

    public Star() {
        name = "Unknown";
        luminosity = 0.0;
        mass = 0.0;
        volume = 0.0;
        age = 0.0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLuminosity() {
        return luminosity;
    }
    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "*********************************************************\n" + name + ", cd= " + luminosity + ", m=" + mass + ", V=" + volume + ", Age=" + age + "\n*********************************************************\n";

    }
}
