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
        
        
        print(f'''Auto 1\n
    Modelo: {auto1.modelo}
    Marca: {auto1.marca}
    Precio: {auto1.precio}
    Registro: {auto1.registro}
    Asientos: [{asiento1.color}:{asiento1.registro}, {asiento2.color}:{asiento2.registro}, {asiento3.color}:{asiento3.registro}, {asiento4.color}:{asiento4.registro}]
    Motor: [Tipo: {motor1.tipo}, Registro: {auto1.motor.registro}, Numero de cilindros: {auto1.motor.numeroCilindros}]
    Numero de asientos: {auto1.cantidadAsientos()}
    Legitimidad: {auto1.verificarIntegridad()}''')


class Asiento:

    def __init__(self,precio,registro=None,color=None):
        self.color = color
        self.precio = precio
        self.registro = registro
    
    def cambiarColor(self,colorValue):

        if colorValue == 'verde' or colorValue =='rojo' or colorValue =='amarillo' or colorValue =='negro' or colorValue =='blanco':
            self.color = colorValue

        else:
            return

class Auto:
    
    def __init__(self,modelo,precio,marca,motor,registro=None,asientos=None):
        self.modelo = modelo
        self.precio = precio
        self.marca = marca
        self.motor = motor
        self.registro = registro
        self.cantidad = 0

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
        
            if self.registro == self.motor.registro:
                    return f'Auto original' 

        else:
            return 'Las piezas no son originales'


class Motor:
    
    def __init__(self,numeroCilindros,tipo,registro=None):
        self.numeroCilindros = numeroCilindros
        self.tipo = tipo
        self.registro = registro

    def cambiarRegistro(self,value):
        self.registro = value

    def asignarTipo(self,typeMotor):

        if typeMotor == 'gasolina' or typeMotor == 'electrico':
            self.tipo = typeMotor

        else:
            return 

if __name__ == '__main__':
    Main()

