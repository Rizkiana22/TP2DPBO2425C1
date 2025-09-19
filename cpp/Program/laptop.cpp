#include <iostream>
#include <string>
#include "produkElektronik.cpp"
using namespace std;

// class laptop turunan dari class ProdukElektronik
class Laptop : public ProdukElektronik {
private:
    // atribut class Laptop
    string tipeProsesor; // seperti intel atau amd
    int kapasitasRAM; // dalam GB
    int storage; // dalam GB

public:
    // Constructor
    Laptop() {
    }

    // Getter untuk tipeProsesor
    string getTipeProsesor() {
        return this->tipeProsesor;
    }

    // Getter untuk kapasitasRAM
    int getKapasitasRAM() {
        return this->kapasitasRAM;
    }

    //  Getter untuk Storage
    int getStorage(){
        return this->storage;
    }

    // Setter untuk tipeProsesor
    void setTipeProsesor(string tipeProsesor) {
        this->tipeProsesor = tipeProsesor;
    }

    // Setter untuk kapasitasRAM
    void setKapasitasRAM(int kapasitasRAM) {
        this->kapasitasRAM = kapasitasRAM;
    }

    // Setter untuk storage
    void setStorage(int storage){
        this->storage = storage;
    }
    
    // Destructor
    ~Laptop() {
    }
};