#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include "laptop.cpp"

using namespace std;

vector<Laptop> daftarLaptop; // vector untuk menampung objek Laptop

void addLaptop(){
    Laptop l; // membuat objek dari class Laptop

    // variabel input
    string id,  nama, merk, model, prosesor;
    int harga, stok, garansi, ram, storage;

    // proses penginputan
    cout << "Tambah Laptop Baru:\n";
    cout << "Id: "; cin >> id;
    cin.ignore(); // buang newline sisa dari cin sebelumnya
    cout << "Nama: "; getline(cin, nama); 
    cout << "Harga: "; cin >> harga;
    cout << "Stok: "; cin >> stok;
    cin.ignore();
    cout << "Merk: "; getline(cin, merk);
    cout << "Model: "; getline(cin, model); 
    cout << "Garansi (bulan): "; cin >> garansi;
    cin.ignore();
    cout << "Prosesor: "; getline(cin, prosesor);
    cout << "RAM (GB): "; cin >> ram;
    cout << "Storage (GB): "; cin >> storage;

    // set input 
    l.setId(id);
    l.setNama(nama);
    l.setHarga(harga);
    l.setStok(stok);
    l.setMerk(merk);
    l.setModel(model);
    l.setGaransi(garansi);
    l.setTipeProsesor(prosesor);
    l.setKapasitasRAM(ram);
    l.setStorage(storage);

    // push ke vector daftarLaptop
    daftarLaptop.push_back(l);
    cout << "Laptop berhasil ditambahkan!\n";
}

// prosedur menampilkan daftarLaptop
void tampilkanLaptop() {
    if (daftarLaptop.empty()) {
        cout << "\nBelum ada data laptop.\n";
        return;
    }

    // Hitung lebar kolom secara dinamis
    int wId = 2, wNama = 4, wMerk = 4, wModel = 5, wProc = 8;
    int wRAM = 3, wStorage = 7, wHarga = 5, wStok = 4, wGaransi = 7;

    // menghitung max dari setiap atribut supaya tabel dinamis
    for (auto &l : daftarLaptop) {
        wId = max(wId, (int)l.getId().size());
        wNama = max(wNama, (int)l.getNama().size());
        wMerk = max(wMerk, (int)l.getMerk().size());
        wModel = max(wModel, (int)l.getModel().size());
        wProc = max(wProc, (int)l.getTipeProsesor().size());
        wRAM = max(wRAM, (int)to_string(l.getKapasitasRAM()).size());
        wStorage = max(wStorage, (int)to_string(l.getStorage()).size());
        wHarga = max(wHarga, (int)to_string(l.getHarga()).size());
        wStok = max(wStok, (int)to_string(l.getStok()).size());
        wGaransi = max(wGaransi, (int)to_string(l.getGaransi()).size());
    }

    cout << string(wId + wNama + wMerk + wModel + wProc + wRAM + wStorage + wHarga + wStok + wGaransi + 50, '-') << endl;
    // Mencetak Header tabel
    cout << left
         << setw(wId + 2) << "ID"
         << setw(wNama + 2) << "Nama"
         << setw(wMerk + 2) << "Merk"
         << setw(wModel + 2) << "Model"
         << setw(wProc + 2) << "Prosesor"
         << setw(wRAM + 6) << "RAM(GB)"
         << setw(wStorage + 9) << "Storage(GB)"
         << setw(wHarga + 6) << "Harga"
         << setw(wStok + 4) << "Stok"
         << setw(wGaransi + 8) << "Garansi" 
         << endl;

    // Garis pemisah
    cout << string(wId + wNama + wMerk + wModel + wProc + wRAM + wStorage + wHarga + wStok + wGaransi + 50, '-') << endl;

    // Mencetak Isi tabel
    for (auto &l : daftarLaptop) {
        cout << left
             << setw(wId + 2) << l.getId()
             << setw(wNama + 2) << l.getNama()
             << setw(wMerk + 2) << l.getMerk()
             << setw(wModel + 2) << l.getModel()
             << setw(wProc + 2) << l.getTipeProsesor()
             << setw(wRAM + 6) << l.getKapasitasRAM()
             << setw(wStorage + 9) << l.getStorage()
             << setw(wHarga + 6) << l.getHarga()
             << setw(wStok + 4) << l.getStok()
             << setw(wGaransi + 8) << l.getGaransi()
             << endl;
    }

    cout << string(wId + wNama + wMerk + wModel + wProc + wRAM + wStorage + wHarga + wStok + wGaransi + 50, '-') << endl;
}


int main() {
    // variabel untuk pilihan menu
    int choice;

    // hardcode input
    Laptop l1;
    l1.setId("L001"); l1.setNama("ASUS ROG Strix"); l1.setMerk("ASUS"); l1.setModel("G15"); 
    l1.setHarga(20000000); l1.setStok(10); l1.setGaransi(24); l1.setTipeProsesor("Intel i7"); 
    l1.setKapasitasRAM(16); l1.setStorage(512);
    daftarLaptop.push_back(l1);

    Laptop l2;
    l2.setId("L002"); l2.setNama("MSI Katana"); l2.setMerk("MSI"); l2.setModel("GF66");
    l2.setHarga(18000000); l2.setStok(5); l2.setGaransi(24); l2.setTipeProsesor("Intel i5");
    l2.setKapasitasRAM(8); l2.setStorage(512);
    daftarLaptop.push_back(l2);

    Laptop l3;
    l3.setId("L003"); l3.setNama("Lenovo Legion"); l3.setMerk("Lenovo"); l3.setModel("5 Pro");
    l3.setHarga(19000000); l3.setStok(7); l3.setGaransi(24); l3.setTipeProsesor("AMD Ryzen 7");
    l3.setKapasitasRAM(16); l3.setStorage(1024);
    daftarLaptop.push_back(l3);

    Laptop l4;
    l4.setId("L004"); l4.setNama("HP Omen"); l4.setMerk("HP"); l4.setModel("15-ek");
    l4.setHarga(18500000); l4.setStok(4); l4.setGaransi(24); l4.setTipeProsesor("Intel i7");
    l4.setKapasitasRAM(16); l4.setStorage(512);
    daftarLaptop.push_back(l4);

    Laptop l5;
    l5.setId("L004"); l5.setNama("Acer Predator"); l5.setMerk("Acer"); l5.setModel("Helios 300");
    l5.setHarga(21000000); l5.setStok(6); l5.setGaransi(24); l5.setTipeProsesor("Intel i9");
    l5.setKapasitasRAM(32); l5.setStorage(1024);
    daftarLaptop.push_back(l5);

    // Menu
    do {
        cout << "Menu:\n";
        cout << "1. Add item\n";
        cout << "2. Show items\n";
        cout << "0. Exit\n";
        cout << "Choose: ";
        cin >> choice;
        cin.ignore();
        if (choice == 1) { // menambahkan objek laptop
            addLaptop();
        } else if (choice == 2) { // menampilkan daftarLaptop
           tampilkanLaptop();
        }
    } while (choice != 0);

    return 0;
}