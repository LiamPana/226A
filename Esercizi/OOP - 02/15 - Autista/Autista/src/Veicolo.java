public class Veicolo {
    private String modello;
    private String marca;
    private String targa;

    public Veicolo(String modello, String marca, String targa) {
        if( modello.isEmpty() || marca.isEmpty() || targa.isEmpty()){
            throw new IllegalArgumentException("modello o marca o targa non valido");
        }else {
            this.modello = modello;
            this.marca = marca;
            this.targa = targa;
        }
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        if( modello.isEmpty()){
            throw new IllegalArgumentException("modello non valido");
        }else {
            this.modello = modello;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}
