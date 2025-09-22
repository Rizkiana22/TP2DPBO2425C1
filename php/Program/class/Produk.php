<?php
class Produk {
    // atribut class produk
    private $id;
    private $nama;
    private $harga;
    private $stok;
    private $gambar; // gambar

    // Constructor
    public function __construct($id = "", $nama = "", $harga = 0, $stok = 0, $gambar = "") {
        $this->id = $id;
        $this->nama = $nama;
        $this->harga = $harga;
        $this->stok = $stok;
        $this->gambar = $gambar;
    }

    // Getter
    public function getId() { return $this->id; }
    public function getNama() { return $this->nama; }
    public function getHarga() { return $this->harga; }
    public function getStok() { return $this->stok; }
    public function getGambar() { return $this->gambar; }

    // Setter
    public function setId($id) { $this->id = $id; }
    public function setNama($nama) { $this->nama = $nama; }
    public function setHarga($harga) { $this->harga = $harga; }
    public function setStok($stok) { $this->stok = $stok; }
    public function setGambar($gambar) { $this->gambar = $gambar; }
}
