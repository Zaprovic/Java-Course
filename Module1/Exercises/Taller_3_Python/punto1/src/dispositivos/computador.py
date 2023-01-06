from dispositivos.celular import Celular
from dispositivos.almacenamientoExterno import AlmacenamientoExterno

class Computador:
    _Computador_cantidad = 0

    def __init__(self,marca,modelo,almacenamiento,ram):
        self.marca = marca
        self.modelo = modelo
        self.almacenamiento = almacenamiento
        self.ram = ram
        self._conectado = False
        Computador._Computador_cantidad += 1

    def setMarca(self,marca):
        self.marca = marca

    def getMarca(self):
        return self.marca

    def getModelo(self):
        return self.modelo

    def setConexion(self,dispositivo):
        self._conectado = dispositivo

    def getConexion(self):
        if isinstance(self._conectado,Celular):
            return "Celular" + self._conectado.modelo

        elif isinstance(self._conectado,AlmacenamientoExterno):
            return "Celular" + self._conectado.getNombre
