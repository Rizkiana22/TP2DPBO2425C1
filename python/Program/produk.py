class Produk:
    # Constructor
    def __init__(self):
        self.__id = ""
        self.__nama = ""
        self.__harga = 0
        self.__stok = 0

    # Getter 
    def get_id(self):
        return self.__id

    def set_id(self, id):
        self.__id = id

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    # Setter
    def get_harga(self):
        return self.__harga

    def set_harga(self, harga):
        self.__harga = harga

    def get_stok(self):
        return self.__stok

    def set_stok(self, stok):
        self.__stok = stok
