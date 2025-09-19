from produk import Produk

# produkElektronik turunan dari produk
class ProdukElektronik(Produk):
    # Constructor
    def __init__(self):
        super().__init__()
        self.__merk = ""
        self.__garansi = 0  # bulan
        self.__model = "" 

    # Getter
    def get_merk(self):
        return self.__merk

    def get_garansi(self):
        return self.__garansi
    
    def get_model(self):
        return self.__model
    
    # Setter
    def set_merk(self, merk):
        self.__merk = merk

    def set_garansi(self, garansi):
        self.__garansi = garansi

    def set_model(self, model):
        self.__model = model
