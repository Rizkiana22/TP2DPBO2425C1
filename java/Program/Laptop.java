// class Laptop merupakan turunan dari class ProdukElektronik
public class Laptop extends ProdukElektronik {
    // atribut class Laptop
    private String tipeProsesor; // intel / amd
    private int kapasitasRAM; // dalam GB
    private int storage; // dalam GB

    // Constructor
    public Laptop() {
    }

    // Getter untuk tipeProsesor
    public String getTipeProsesor() {
        return this.tipeProsesor;
    }

    // Getter untuk kapasitasRAM
    public int getKapasitasRAM() {
        return this.kapasitasRAM;
    }

    // Getter untuk storage
    public int getStorage() {
        return this.storage;
    }

    // Setter untuk tipeProsesor
    public void setTipeProsesor(String tipeProsesor) {
        this.tipeProsesor = tipeProsesor;
    }

    // Setter untuk kapasitasRAM
    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }

    // Setter untuk storage
    public void setStorage(int storage) {
        this.storage = storage;
    }
}
