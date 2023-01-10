class Carro:
    puertas = 4
    carros = 0

    def __init__(self, referencia, peso=4, marca="Ford" ,motor=None, *args):
        self._referencia = referencia
        self._peso = peso
        self._marca = marca
        self._motor = motor
        self.args = args

        Carro.carros += 1

    
    def getPeso(self):
        return self._peso

    def getReferencia(self):
        return self._referencia

    @staticmethod
    def carroMasPesado(carros):
        auxRef = carros[0].getReferencia()
        auxPeso = carros[0].getPeso()

        for carro in carros:
            if carro.getPeso() > auxPeso:
                auxRef = carro.getReferencia()
                auxPeso = carro.getPeso()

        return auxRef

if __name__ == '__main__':
    #carro0 = Carro()
    carro1 = Carro("Tracker")
    carro2 = Carro("Sandero Stepway",3,"Renault","v8")
    carro3 = Carro("Picanto",2,"Kia")

    carro4 = Carro("X1",2,2,2,22,2,2,2,22,2,2)

    print(Carro.carroMasPesado([carro1, carro2 ,carro3]))

