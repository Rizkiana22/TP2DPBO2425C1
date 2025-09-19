<?php
require_once "ProdukElektronik.php";

// class Laptop merupakan keturunan dari class ProdukElektronik
class Laptop extends ProdukElektronik {
    // atribut class Laptop
    private $tipeProsesor; // seperti intel atau amd
    private $kapasitasRAM; // dalam GB
    private $storage; // dalam GB
    private $gambar; // gambar laptop

    // Constructor
    public function __construct($id = "", $nama = "", $harga = 0, $stok = 0,
                                $merk = "", $garansi = 0, $model = "",
                                $tipeProsesor = "", $kapasitasRAM = 0, $storage = 0,
                                $gambar = "") {
        parent::__construct($id, $nama, $harga, $stok, $merk, $garansi, $model);
        $this->tipeProsesor = $tipeProsesor;
        $this->kapasitasRAM = $kapasitasRAM;
        $this->storage = $storage;
        $this->gambar = $gambar;
    }

    // Getter
    public function getTipeProsesor() { return $this->tipeProsesor; }
    public function getKapasitasRAM() { return $this->kapasitasRAM; }
    public function getStorage() { return $this->storage; }
    public function getGambar() { return $this->gambar; }

    // Setter
    public function setTipeProsesor($tipeProsesor) { $this->tipeProsesor = $tipeProsesor; }
    public function setKapasitasRAM($kapasitasRAM) { $this->kapasitasRAM = $kapasitasRAM; }
    public function setStorage($storage) { $this->storage = $storage; }
    public function setGambar($gambar) { $this->gambar = $gambar; }
}
