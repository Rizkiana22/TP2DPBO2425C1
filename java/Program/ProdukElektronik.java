// class ProdukElektronik merupakan keturunan dari class Produk
public class ProdukElektronik extends Produk {
    // atribut class ProdukElektronik
    private String merk;
    private int garansi; // dalam bulan
    private String model; // model laptop

    // Constructor
    public ProdukElektronik() {
    }

    // Getter untuk merk
    public String getMerk() {
        return this.merk;
    }

    // Getter untuk garansi
    public int getGaransi() {
        return this.garansi;
    }

    // Getter untuk model
    public String getModel() {
        return this.model;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk garansi
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    // Setter untuk model
    public void setModel(String model) {
        this.model = model;
    }
}
