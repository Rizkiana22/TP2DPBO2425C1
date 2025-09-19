public class Produk {
    // atribut class Produk
    private String id;
    private String nama;
    private int harga;
    private int stok;

    // Constructor
    public Produk() {
    }

    // Getter untuk id
    public String getId() {
        return this.id;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Getter untuk harga
    public int getHarga() {
        return this.harga;
    }

    // Getter untuk stok
    public int getStok() {
        return this.stok;
    }

    // Setter untuk id
    public void setId(String id) {
        this.id = id;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Setter untuk stok
    public void setStok(int stok) {
        this.stok = stok;
    }
}
