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

        // Hitung lebar kolom dinamis
        int wId = 2, wNama = 4, wMerk = 4, wModel = 5, wProc = 8;
        int wRAM = 3, wStorage = 7, wHarga = 5, wStok = 4, wGaransi = 7;

        // menghitung max dari setiap atribut supaya tabel dinamis
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

        String garis = "-".repeat(wId + wNama + wMerk + wModel + wProc +
                                wRAM + wStorage + wHarga + wStok + wGaransi + 50);
        System.out.println(garis);

        // Mencetak Header tabel
        String format = "%-" + (wId + 2) + "s"
                    + "%-" + (wNama + 2) + "s"
                    + "%-" + (wMerk + 2) + "s"
                    + "%-" + (wModel + 2) + "s"
                    + "%-" + (wProc + 2) + "s"
                    + "%-" + (wRAM + 6) + "s"
                    + "%-" + (wStorage + 9) + "s"
                    + "%-" + (wHarga + 6) + "s"
                    + "%-" + (wStok + 4) + "s"
                    + "%-" + (wGaransi + 8) + "s\n";

        System.out.printf(format, "ID", "Nama", "Merk", "Model", "Prosesor",
                "RAM(GB)", "Storage(GB)", "Harga", "Stok", "Garansi");
        System.out.println(garis);

        // Mencetak isi tabel
        for (Laptop l : daftarLaptop) {
            System.out.printf(format,
                    l.getId(),
                    l.getNama(),
                    l.getMerk(),
                    l.getModel(),
                    l.getTipeProsesor(),
                    l.getKapasitasRAM(),
                    l.getStorage(),
                    l.getHarga(),
                    l.getStok(),
                    l.getGaransi()
            );
        }
        System.out.println(garis);
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
