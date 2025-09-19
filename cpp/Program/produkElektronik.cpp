#include <iostream>
#include <string>
#include "produk.cpp"
using namespace std;

// produkElektronik turunan dari produk
class ProdukElektronik : public Produk {
private:
    // atribut class ProdukElektronik
    string merk;
    int garansi; // dalam bulan
    string model; // model laptop

public:
    // Constructor
    ProdukElektronik(){
    }

    // Getter untuk merk
    string getMerk() {
        return this->merk;
    }

    // Getter untuk garansi
    int getGaransi() {
        return this->garansi;
    }

    // Getter untuk model
    string getModel(){
        return this->model;
    }

    // Setter untuk merk
    void setMerk(string merk) {
        this->merk = merk;
    }

    // Setter untuk garansi
    void setGaransi(int garansi) {
        this->garansi = garansi;
    }

    // Setter untuk model
    void setModel(string model){
        this->model = model;
    }

    // Destructor
    ~ProdukElektronik() {
    }
};