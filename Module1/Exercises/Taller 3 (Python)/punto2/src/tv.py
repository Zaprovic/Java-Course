class TV:

    _numTV = 0

    def __init__(self,marca,control,canal=1,precio=500,estado=False,volumen=1):
        self.marca = marca
        self.canal = canal
        self.precio = precio
        self.estado = estado
        self.volumen = volumen
        self.control = control

        TV._numTV += 1

    def setMarca(self,marca):
        self.marca = marca

    def getMarca(self):
        return self.marca
        
    def setcontrol(self,control):
        self.control = control

    def getControl(self):
        return self.control

    def setPrecio(self,precio):
        self.precio = precio

    def getPrecio(self):
        return self.precio

    def setVolumen(self,volumen):
        self.volumen = volumen

    def getVolumen(self):
        return self.volumen

    def setCanal(self,canal):
        self.canal = canal

    def getCanal(self):
        return self.canal

    @classmethod
    def getCantidad(cls):
        return cls._numTV

    

        
