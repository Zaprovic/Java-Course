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

    def getEstado(self):
        return self.estado

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
        if 0 <= volumen <= 7 and self.estado:
            self.volumen = volumen

    def getVolumen(self):
        return self.volumen

    def setCanal(self,canal):
        if 1 <= canal <= 120 and self.estado:
            self.canal = canal

    def getCanal(self):
        return self.canal

    def canalUp(self):
        if self.getEstado() and 1 < self.canal < 120:
         self.canal += 1

    def canalDown(self):
        if self.getEstado() and 1 < self.canal < 120:
            self.canal -= 1
    
    def volumenUp(self):
        if self.getEstado() and 0 < self.volumen < 7:
            self.volumen += 1

    def volumenDown(self):
        if self.getEstado() and 0 < self.volumen < 7:
            self.volumen -= 1

    @classmethod
    def getCantidad(cls):
        return cls._numTV

    

        
