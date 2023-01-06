import random

class Apostador:
    def __init__(self,id,name,phoneNumber,email):
        self.id = id
        self.name = name
        self.phoneNumber = phoneNumber
        self.email = email
        self.wallet = 0

    def deposit(self,amount):
        self.wallet += amount
        return amount

    def play(self,value):
        
        if self.wallet >= value:
            loteria = Loteria(value,self)
            loteria.playGame()

        else:
            print('Necesitas mas dinero en tu wallet para jugar, o puedes apostar por un valor inferior')


class ComisionJuegoEspectaculos:
    COMMIPERCENTAGE = 0.20

    def __init__(self,loteria):
        self.loteria = loteria

    def comission(self):
        loteriaValue = self.loteria.value
        comission = self.gain(loteriaValue,self.COMMIPERCENTAGE)
        return comission

    @staticmethod
    def gain(loteriaValue,percentage):
        gain = loteriaValue - (loteriaValue*percentage)
        return gain


class Loteria:
    probability = 0.5

    def __init__(self,value,apostador):
        self.value = value
        self.apostador = apostador

    def payMoney(self,gain):
        self.apostador.wallet += gain

    def receiveMoney(self):
        self.apostador.wallet -= self.value

    def playGame(self):
        a = random.randint(0,1)

        if a < self.probability:
            commi = ComisionJuegoEspectaculos(self)
            gain = commi.comission()
            total = gain + self.value

            print(f'Has ganado {gain}')
            self.payMoney(gain)

        else:
            print(f'Has perdido lo que apostaste')
            self.receiveMoney()


if __name__ == '__main__':
    apostador1 = Apostador(1,'Juan',302,'j@gmail.com')
    apostador1.deposit(500)

    print(f'Saldo inicial de {apostador1.name}: {apostador1.wallet}')

    apostador1.play(400)
    print(f'Saldo actual de {apostador1.name}: {apostador1.wallet}')



        





    

    
