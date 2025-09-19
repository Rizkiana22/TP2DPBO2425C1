from laptop import Laptop

daftar_laptop = [] # list untuk menampung objek laptop

def add_laptop():
    l = Laptop() # membuat objek dari class Laptop
    print("Tambah Laptop Baru:")

    # proses penginputan
    l.set_id(input("Id: "))
    l.set_nama(input("Nama: "))
    l.set_harga(int(input("Harga: ")))
    l.set_stok(int(input("Stok: ")))
    l.set_merk(input("Merk: "))
    l.set_model(input("Model: "))
    l.set_garansi(int(input("Garansi (bulan): ")))
    l.set_tipe_prosesor(input("Prosesor: "))
    l.set_kapasitas_ram(int(input("RAM (GB): ")))
    l.set_storage(int(input("Storage (GB): ")))

    # add ke list
    daftar_laptop.append(l)
    print("Laptop berhasil ditambahkan!\n")


# function untuk menampilkan daftarLaptop
def tampilkan_laptop():
    if not daftar_laptop:
        print("\nBelum ada data laptop.\n")
        return

    # Hitung panjang maksimum tiap kolom
    wId = max(len("ID"), max(len(l.get_id()) for l in daftar_laptop))
    wNama = max(len("Nama"), max(len(l.get_nama()) for l in daftar_laptop))
    wMerk = max(len("Merk"), max(len(l.get_merk()) for l in daftar_laptop))
    wModel = max(len("Model"), max(len(l.get_model()) for l in daftar_laptop))
    wProc = max(len("Prosesor"), max(len(l.get_tipe_prosesor()) for l in daftar_laptop))
    wRAM = max(len("RAM"), max(len(str(l.get_kapasitas_ram())+"GB") for l in daftar_laptop))
    wStorage = max(len("Storage"), max(len(str(l.get_storage())+"GB") for l in daftar_laptop))
    wHarga = max(len("Harga"), max(len(str(l.get_harga())) for l in daftar_laptop))
    wStok = max(len("Stok"), max(len(str(l.get_stok())) for l in daftar_laptop))
    wGaransi = max(len("Garansi"), max(len(str(l.get_garansi())+"bln") for l in daftar_laptop))

    # Header
    header = (
        f"{'ID':<{wId}} {'Nama':<{wNama}} {'Merk':<{wMerk}} {'Model':<{wModel}} "
        f"{'Prosesor':<{wProc}} {'RAM':<{wRAM}} {'Storage':<{wStorage}} "
        f"{'Harga':<{wHarga}} {'Stok':<{wStok}} {'Garansi':<{wGaransi}}"
    )
    print(header)
    print("-" * len(header))

    # Data isi tabel
    for l in daftar_laptop:
        print(
            f"{l.get_id():<{wId}} "
            f"{l.get_nama():<{wNama}} "
            f"{l.get_merk():<{wMerk}} "
            f"{l.get_model():<{wModel}} "
            f"{l.get_tipe_prosesor():<{wProc}} "
            f"{str(l.get_kapasitas_ram())+'GB':<{wRAM}} "
            f"{str(l.get_storage())+'GB':<{wStorage}} "
            f"{l.get_harga():<{wHarga}} "
            f"{l.get_stok():<{wStok}} "
            f"{str(l.get_garansi())+'bln':<{wGaransi}}"
        )

    print("-" * len(header))



def main():
    # hardcode data
    l1 = Laptop()
    l1.set_id("L001"); l1.set_nama("ASUS ROG Strix"); l1.set_merk("ASUS"); l1.set_model("G15")
    l1.set_harga(20000000); l1.set_stok(10); l1.set_garansi(24); l1.set_tipe_prosesor("Intel i7")
    l1.set_kapasitas_ram(16); l1.set_storage(512)
    daftar_laptop.append(l1)

    l2 = Laptop()
    l2.set_id("L002"); l2.set_nama("MSI Katana"); l2.set_merk("MSI"); l2.set_model("GF66")
    l2.set_harga(18000000); l2.set_stok(5); l2.set_garansi(24); l2.set_tipe_prosesor("Intel i5")
    l2.set_kapasitas_ram(8); l2.set_storage(512)
    daftar_laptop.append(l2)

    l3 = Laptop()
    l3.set_id("L003"); l3.set_nama("Lenovo Legion"); l3.set_merk("Lenovo"); l3.set_model("5 Pro")
    l3.set_harga(19000000); l3.set_stok(7); l3.set_garansi(24); l3.set_tipe_prosesor("AMD Ryzen 7")
    l3.set_kapasitas_ram(16); l3.set_storage(1024)
    daftar_laptop.append(l3)

    l4 = Laptop()
    l4.set_id("L004"); l4.set_nama("HP Omen"); l4.set_merk("HP"); l4.set_model("15-ek")
    l4.set_harga(18500000); l4.set_stok(4); l4.set_garansi(24); l4.set_tipe_prosesor("Intel i7")
    l4.set_kapasitas_ram(16); l4.set_storage(512)
    daftar_laptop.append(l4)

    l5 = Laptop()
    l5.set_id("L005"); l5.set_nama("Acer Predator"); l5.set_merk("Acer"); l5.set_model("Helios 300")
    l5.set_harga(21000000); l5.set_stok(6); l5.set_garansi(24); l5.set_tipe_prosesor("Intel i9")
    l5.set_kapasitas_ram(32); l5.set_storage(1024)
    daftar_laptop.append(l5)

    # Menu
    while True:
        print("\nMenu:")
        print("1. Add item")
        print("2. Show items")
        print("0. Exit")
        choice = input("Choose: ")

        if choice == "1": # menambahkan objek laptop
            add_laptop()
        elif choice == "2": # menampilkan daftarLaptop
            tampilkan_laptop()
        elif choice == "0":
            break
        else:
            print("Pilihan tidak valid!")

if __name__ == "__main__":
    main()
