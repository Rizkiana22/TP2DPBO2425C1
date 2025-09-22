<?php
require_once "Produk.php";

// produkElektronik turunan dari produk
class ProdukElektronik extends Produk {
    // atribut class ProdukElektronik
    private $merk;
    private $garansi; // dalam bulan
    private $model; // model laptop

    // Constructor
    public function __construct($id = "", $nama = "", $harga = 0, $stok = 0, $gambar = "",
                                $merk = "", $garansi = 0, $model = "") {
        parent::__construct($id, $nama, $harga, $stok, $gambar);
        $this->merk = $merk;
        $this->garansi = $garansi;
        $this->model = $model;
    }

    // Getter
    public function getMerk() { return $this->merk; }
    public function getGaransi() { return $this->garansi; }
    public function getModel() { return $this->model; }

    // Setter
    public function setMerk($merk) { $this->merk = $merk; }
    public function setGaransi($garansi) { $this->garansi = $garansi; }
    public function setModel($model) { $this->model = $model; }
}
