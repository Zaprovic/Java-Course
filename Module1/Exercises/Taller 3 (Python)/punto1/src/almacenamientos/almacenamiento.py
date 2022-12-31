class Almacenamiento:
    def __init__(self,tamano,tipo):
        self.tipo = tipo
        self._TAMANO = tamano

    def getTamano(self):
        return self._TAMANO

    def setTamano(self,tamano):
        self._TAMANO = tamano

