class Laptop:
    # Constructor
    def __init__(self, marca, modelo, ram, almacenamiento,precio):
        self.marca = marca
        self.modelo = modelo
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.precio=precio

    def mostrar_informacion(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Memoria RAM: {self.ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")
        print(f"Precio: $ {self.precio}")


# Crear un objeto de la clase Laptop
mi_laptop = Laptop("Lenovo", "ThinkPad", 16, 512,42000000)

mi_laptop.mostrar_informacion()
