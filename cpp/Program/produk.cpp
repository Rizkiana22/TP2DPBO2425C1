#include <iostream>
#include <string>

using namespace std;

class Produk {
private:
    // atribut produk
    string id;
    string nama;
    int harga;
    int stok;

public:
    // Constructor
    Produk(){
    }

    // Getter untuk id
    string getId(){
        return this->id;
    }

    // Getter untuk nama
    string getNama(){
        return this->nama;
    }

    // Getter untuk harga
    int getHarga(){
        return this->harga;
    }

    // Getter untuk stok
    int getStok(){
        return this->stok;
    }

    // Setter untuk nama
    void setNama(string nama) {
        this->nama = nama;
    }

    // Setter untuk harga
    void setHarga(int harga) {
        this->harga = harga;
    }

    // Setter untuk stok
    void setStok(int stok) {
        this->stok = stok;
    }

    // Setter untuk stok
    void setId(string id) {
        this->id = id;
    }

    // destructor
    ~Produk(){
    }
};