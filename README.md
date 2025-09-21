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
<img width="161" height="552" alt="DesainInheritance drawio (1)" src="https://github.com/user-attachments/assets/0aeb2b15-db7e-49d3-ae5e-a5f08fc8cb92" />


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
1. **cpp**
<img width="1273" height="877" alt="Screenshot 2025-09-19 191205" src="https://github.com/user-attachments/assets/a568917a-f3bf-4346-8e11-dd6b960fe3b6" />


2. **java**
<img width="1269" height="837" alt="Screenshot 2025-09-19 191346" src="https://github.com/user-attachments/assets/99450a61-8fcb-46fa-9683-a58a2f627cd0" />


3. **python**
<img width="891" height="909" alt="Screenshot 2025-09-19 191504" src="https://github.com/user-attachments/assets/b3e00026-3e7b-438f-8b9f-4bc8701d8c58" />


4. **php**
<img width="1909" height="906" alt="Screenshot 2025-09-19 191553" src="https://github.com/user-attachments/assets/f137b211-93c2-4ff8-9634-9d444121381b" />

