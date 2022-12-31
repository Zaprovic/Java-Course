class Main:

    def __init__(self):
        print('MAIN PROGRAM RUNNING\n')

        #Asientos
        asiento1 = Asiento(precio=250,registro=12)
        asiento2 = Asiento(precio=350,registro=12)
        asiento3 = Asiento(precio=150,registro=12)
        asiento4 = Asiento(precio=550,registro=12)

        asiento1.cambiarColor('amarillo')
        asiento2.cambiarColor('verde')
        asiento3.cambiarColor('rojo')
        asiento4.cambiarColor('negro')

        asientosLista = [asiento1,asiento2,asiento3,asiento4]

        #Motor
        motor1 = Motor(numeroCilindros=6,tipo='gasolina',registro=12)
        motor1.asignarTipo('electrico')
        motor1.asignarTipo('gas')

        #Auto
        auto1 = Auto(modelo='X6 Competition',precio=150000,marca='BMW',registro=12,asientos=asientosLista,motor=motor1)
        auto1.cantidad += 1

        print(auto1.__dict__)
        print('\n')

        print(f'\n Total de autos: {Auto.totalAutos}')


class Asiento:

    def __init__(self,precio,registro=None,color=None):
        self.color = color
        self.precio = precio
        self.registro = registro
    
    def cambiarColor(self,color):

        if color == 'verde' or color =='rojo' or color =='amarillo' or color =='negro' or color =='blanco':
            self.color = color

        else:
            return


class Auto:
    totalAutos = 0
    
    def __init__(self,modelo,precio,marca,motor,registro=None,asientos=None):
        self.modelo = modelo
        self.precio = precio
        self.marca = marca
        self.motor = motor
        self.registro = registro
        self.cantidad = 0

        Auto.totalAutos += 1

        if asientos is not None:
            self.asientos = asientos


    def cantidadAsientos(self):
        c = 0

        for i in self.asientos:
            if i.__class__.__name__ != 'Asiento':
                c += 1

        return len(self.asientos) if c == 0 else None


    def verificarIntegridad(self):

        asientosRegistros = [i.registro for i in self.asientos]

        if len(set(asientosRegistros)) == 1:
        
            if self.registro == self.motor.registro and self.registro == asientosRegistros[0]:
                    return 'Auto original' 
            else:
                return 'Las piezas no son originales'

        else:
            return 'Las piezas no son originales'

    def carInfo(self):

        print(f'''Auto 1\n
    Modelo: {self.modelo}
    Marca: {self.marca}
    Precio: {self.precio}
    Registro: {self.registro}
    Motor: [Tipo: {self.motor.tipo}, Registro: {self.motor.registro}, Numero de cilindros: {self.motor.numeroCilindros}]
    Numero de asientos: {self.cantidadAsientos()}
    Legitimidad: {self.verificarIntegridad()}''')


class Motor:
    
    def __init__(self,numeroCilindros,tipo,registro=None):
        self.numeroCilindros = numeroCilindros
        self.tipo = tipo
        self.registro = registro

    def cambiarRegistro(self,registro):
        self.registro = registro

    def asignarTipo(self,tipo):

        if tipo == 'gasolina' or tipo == 'electrico':
            self.tipo = tipo

        else:
            return 


if __name__ == '__main__':
    Main()

