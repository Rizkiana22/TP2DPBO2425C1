<?php
require_once "ProdukElektronik.php";

// class Laptop merupakan keturunan dari class ProdukElektronik
class Laptop extends ProdukElektronik {
    // atribut class Laptop
    private $tipeProsesor; // seperti intel atau amd
    private $kapasitasRAM; // dalam GB
    private $storage; // dalam GB


    // Constructor
    public function __construct($id = "", $nama = "", $harga = 0, $stok = 0, $gambar = "",
                                $merk = "", $garansi = 0, $model = "",
                                $tipeProsesor = "", $kapasitasRAM = 0, $storage = 0,
                                ) {
        parent::__construct($id, $nama, $harga, $stok, $gambar, $merk, $garansi, $model);
        $this->tipeProsesor = $tipeProsesor;
        $this->kapasitasRAM = $kapasitasRAM;
        $this->storage = $storage;
    }

    // Getter
    public function getTipeProsesor() { return $this->tipeProsesor; }
    public function getKapasitasRAM() { return $this->kapasitasRAM; }
    public function getStorage() { return $this->storage; }

    // Setter
    public function setTipeProsesor($tipeProsesor) { $this->tipeProsesor = $tipeProsesor; }
    public function setKapasitasRAM($kapasitasRAM) { $this->kapasitasRAM = $kapasitasRAM; }
    public function setStorage($storage) { $this->storage = $storage; }
}
