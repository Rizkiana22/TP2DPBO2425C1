import java.util.*;

public class Main {
    static List<Laptop> daftarLaptop = new ArrayList<>(); // array list untuk menampung objek laptop
    static Scanner sc = new Scanner(System.in);

    public static void addLaptop() {
        Laptop l = new Laptop(); // membuat objek dari class laptop

        // proses penginputan
        System.out.println("Tambah Laptop Baru:");
        System.out.print("Id: ");
        l.setId(sc.nextLine());

        System.out.print("Nama: ");
        l.setNama(sc.nextLine());

        System.out.print("Harga: ");
        l.setHarga(Integer.parseInt(sc.nextLine()));

        System.out.print("Stok: ");
        l.setStok(Integer.parseInt(sc.nextLine()));

        System.out.print("Merk: ");
        l.setMerk(sc.nextLine());

        System.out.print("Model: ");
        l.setModel(sc.nextLine());

        System.out.print("Garansi (bulan): ");
        l.setGaransi(Integer.parseInt(sc.nextLine()));

        System.out.print("Prosesor: ");
        l.setTipeProsesor(sc.nextLine());

        System.out.print("RAM (GB): ");
        l.setKapasitasRAM(Integer.parseInt(sc.nextLine()));

        System.out.print("Storage (GB): ");
        l.setStorage(Integer.parseInt(sc.nextLine()));

        // add ke arraylist
        daftarLaptop.add(l);
        System.out.println("Laptop berhasil ditambahkan!\n");
    }

    // prosedur menampilkan daftarLaptop
    public static void tampilkanLaptop() {
        if (daftarLaptop.isEmpty()) {
            System.out.println("\nBelum ada data laptop.\n");
            return;
        }

        // Hitung lebar tiap kolom dari header dulu
        int wId = "ID".length();
        int wNama = "Nama".length();
        int wMerk = "Merk".length();
        int wModel = "Model".length();
        int wProc = "Prosesor".length();
        int wRAM = "RAM(GB)".length();
        int wStorage = "Storage(GB)".length();
        int wHarga = "Harga".length();
        int wStok = "Stok".length();
        int wGaransi = "Garansi".length();

        // Sesuaikan lebar dengan isi data
        for (Laptop l : daftarLaptop) {
            wId = Math.max(wId, l.getId().length());
            wNama = Math.max(wNama, l.getNama().length());
            wMerk = Math.max(wMerk, l.getMerk().length());
            wModel = Math.max(wModel, l.getModel().length());
            wProc = Math.max(wProc, l.getTipeProsesor().length());
            wRAM = Math.max(wRAM, String.valueOf(l.getKapasitasRAM()).length());
            wStorage = Math.max(wStorage, String.valueOf(l.getStorage()).length());
            wHarga = Math.max(wHarga, String.valueOf(l.getHarga()).length());
            wStok = Math.max(wStok, String.valueOf(l.getStok()).length());
            wGaransi = Math.max(wGaransi, String.valueOf(l.getGaransi()).length());
        }

        // Hitung total lebar tabel
        int totalWidth = (wId + 2) + (wNama + 2) + (wMerk + 2) + (wModel + 2) +
                        (wProc + 2) + (wRAM + 2) + (wStorage + 2) +
                        (wHarga + 2) + (wStok + 2) + (wGaransi + 2) +
                        (10 + 1); // 10 kolom + 1 ujung kanan

        // Fungsi garis
        Runnable garis = () -> {
            System.out.print("+");
            for (int i = 0; i < totalWidth - 2; i++) System.out.print("-");
            System.out.println("+");
        };

        // Cetak header
        garis.run();
        System.out.printf("| %-" + wId + "s ", "ID");
        System.out.printf("| %-" + wNama + "s ", "Nama");
        System.out.printf("| %-" + wMerk + "s ", "Merk");
        System.out.printf("| %-" + wModel + "s ", "Model");
        System.out.printf("| %-" + wProc + "s ", "Prosesor");
        System.out.printf("| %-" + wRAM + "s ", "RAM(GB)");
        System.out.printf("| %-" + wStorage + "s ", "Storage(GB)");
        System.out.printf("| %-" + wHarga + "s ", "Harga");
        System.out.printf("| %-" + wStok + "s ", "Stok");
        System.out.printf("| %-" + wGaransi + "s |\n", "Garansi");
        garis.run();

        // Cetak data
        for (Laptop l : daftarLaptop) {
            System.out.printf("| %-" + wId + "s ", l.getId());
            System.out.printf("| %-" + wNama + "s ", l.getNama());
            System.out.printf("| %-" + wMerk + "s ", l.getMerk());
            System.out.printf("| %-" + wModel + "s ", l.getModel());
            System.out.printf("| %-" + wProc + "s ", l.getTipeProsesor());
            System.out.printf("| %-" + wRAM + "d ", l.getKapasitasRAM());
            System.out.printf("| %-" + wStorage + "d ", l.getStorage());
            System.out.printf("| %-" + wHarga + "d ", l.getHarga());
            System.out.printf("| %-" + wStok + "d ", l.getStok());
            System.out.printf("| %-" + wGaransi + "d |\n", l.getGaransi());
        }
        garis.run();
    }



    public static void main(String[] args) {
        // hardcode data
        Laptop l1 = new Laptop();
        l1.setId("L001"); l1.setNama("ASUS ROG Strix"); l1.setMerk("ASUS"); l1.setModel("G15");
        l1.setHarga(20000000); l1.setStok(10); l1.setGaransi(24); l1.setTipeProsesor("Intel i7");
        l1.setKapasitasRAM(16); l1.setStorage(512);
        daftarLaptop.add(l1);

        Laptop l2 = new Laptop();
        l2.setId("L002"); l2.setNama("MSI Katana"); l2.setMerk("MSI"); l2.setModel("GF66");
        l2.setHarga(18000000); l2.setStok(5); l2.setGaransi(24); l2.setTipeProsesor("Intel i5");
        l2.setKapasitasRAM(8); l2.setStorage(512);
        daftarLaptop.add(l2);

        Laptop l3 = new Laptop();
        l3.setId("L003"); l3.setNama("Lenovo Legion"); l3.setMerk("Lenovo"); l3.setModel("5 Pro");
        l3.setHarga(19000000); l3.setStok(7); l3.setGaransi(24); l3.setTipeProsesor("AMD Ryzen 7");
        l3.setKapasitasRAM(16); l3.setStorage(1024);
        daftarLaptop.add(l3);

        Laptop l4 = new Laptop();
        l4.setId("L004"); l4.setNama("HP Omen"); l4.setMerk("HP"); l4.setModel("15-ek");
        l4.setHarga(18500000); l4.setStok(4); l4.setGaransi(24); l4.setTipeProsesor("Intel i7");
        l4.setKapasitasRAM(16); l4.setStorage(512);
        daftarLaptop.add(l4);

        Laptop l5 = new Laptop();
        l5.setId("L005"); l5.setNama("Acer Predator"); l5.setMerk("Acer"); l5.setModel("Helios 300");
        l5.setHarga(21000000); l5.setStok(6); l5.setGaransi(24); l5.setTipeProsesor("Intel i9");
        l5.setKapasitasRAM(32); l5.setStorage(1024);
        daftarLaptop.add(l5);

        // Menu
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Show items");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) { // menambahkan objek laptop
                addLaptop();
            } else if (choice == 2) { // menampilkan daftarLaptop
                tampilkanLaptop();
            }
        } while (choice != 0);

        sc.close();
    }
}
