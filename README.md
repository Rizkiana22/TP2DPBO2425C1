# TP2DPBO2425C1

## Janji
Saya **Muhammad Rizkiana Pratama** dengan **NIM 2404421** mengerjakan **Tugas Praktikum 2** dalam mata kuliah **Desain dan Pemrograman Berorientasi Objek**.  
Untuk keberkahan-Nya maka saya **tidak melakukan kecurangan** seperti yang telah dispesifikasikan. Aamiin.  

---

## Deskripsi Program
Repositori ini berisi implementasi program berbasis **Object-Oriented Programming (OOP)** dalam berbagai bahasa pemrograman: **C++**, **Java**, **Python**, dan **PHP**.  
Program ini mengimplementasikan konsep **Multi-Level Inheritance** dengan tiga tingkat kelas.  

---

## Desain Program
1. **Produk**  
   Kelas dasar yang berisi atribut umum sebuah produk, yaitu:  
   - `id` → kode unik produk  
   - `nama` → nama produk  
   - `harga` → harga produk  
   - `stok` → jumlah stok yang tersedia  
   Disertai dengan **getter** dan **setter** untuk mengakses dan mengubah nilai atribut.  

2. **ProdukElektronik**  
   Kelas turunan dari `Produk` yang menambahkan atribut khusus untuk produk elektronik, yaitu:  
   - `merk` → merek produk elektronik  
   - `garansi` → lama garansi (dalam bulan)  
   - `model` → tipe atau seri dari produk elektronik  
   Disertai dengan **getter** dan **setter** untuk mengakses dan mengubah nilai atribut.  

3. **Laptop**  
   Kelas turunan dari `ProdukElektronik` yang merepresentasikan laptop dengan atribut yang lebih spesifik, yaitu:  
   - `tipeProsesor` → jenis prosesor (contoh: Intel, AMD)  
   - `kapasitasRAM` → besar RAM dalam GB  
   - `storage` → kapasitas penyimpanan dalam GB  
   Disertai dengan **getter** dan **setter** untuk mengakses dan mengubah nilai atribut.  

---

## Diagram


## Alur Program
1. **Inisialisasi Kelas**  
   Program mendefinisikan tiga tingkat kelas dengan konsep **Multi-Level Inheritance**:
   - `Produk` (kelas dasar)  
   - `ProdukElektronik` (turunan dari `Produk`)  
   - `Laptop` (turunan dari `ProdukElektronik`)  

2. **Pembuatan Objek**  
   - Objek laptop dibuat dari kelas `Laptop`.  
   - Karena `Laptop` adalah turunan dari `ProdukElektronik` dan `Produk`, maka objek ini otomatis memiliki seluruh atribut dari ketiga kelas.  

3. **Pengisian Data (Setter)**  
   Program menggunakan **setter** untuk mengisi data atribut:
   - Atribut dasar (`id`, `nama`, `harga`, `stok`)  
   - Atribut elektronik (`merk`, `garansi`, `model`)  
   - Atribut laptop (`tipeProsesor`, `kapasitasRAM`, `storage`)  

4. **Pengambilan Data (Getter)**  
   - Program menggunakan **getter** untuk mengambil nilai atribut.  
   - Data yang telah dimasukkan akan ditampilkan ke layar.  

5. **Output Program**  
   - Program menampilkan informasi lengkap sebuah laptop, mulai dari identitas produk, spesifikasi elektronik, hingga detail laptop.  

---

## Dokumentasi
1. cpp


2. java


3. python


4. php
