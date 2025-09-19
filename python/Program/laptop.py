from produk_elektronik import ProdukElektronik

# class Laptop merupakan keturunan dari class ProdukElektronik
class Laptop(ProdukElektronik):
    # Constructor
    def __init__(self):
        super().__init__()
        self.__tipe_prosesor = ""
        self.__kapasitas_ram = 0
        self.__storage = 0

    # Getter
    def get_tipe_prosesor(self):
        return self.__tipe_prosesor

    def get_kapasitas_ram(self):
        return self.__kapasitas_ram
    
    def get_storage(self):
        return self.__storage
    
    # Setter
    def set_tipe_prosesor(self, tipe):
        self.__tipe_prosesor = tipe

    def set_kapasitas_ram(self, ram):
        self.__kapasitas_ram = ram

    def set_storage(self, storage):
        self.__storage = storage
