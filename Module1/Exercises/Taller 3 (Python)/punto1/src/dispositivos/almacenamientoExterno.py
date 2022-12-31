from almacenamientos.almacenamiento import Almacenamiento

class AlmacenamientoExterno:
    _cantidad = 0

    def __init__(self,nombre):
        self.nombre = nombre
        self.almacenamiento = Almacenamiento(1000,'HDD')
        AlmacenamientoExterno._cantidad += 1

    def setNombre(self,nombre):
        self.nombre = nombre

    def getNombre(self):
        return self.nombre

    def setAlmacenamiento(self,almacenamiento):
        self.almacenamiento = almacenamiento

    def getAlmacenamiento(self):
        return self.almacenamiento

    @classmethod
    def getCantidad(cls):
        return cls._cantidad