import random

class Apostador:

    def __init__(self, id , name, phoneNumber, email):
        self.id = id
        self.name = name
        self.phoneNumber = phoneNumber
        self.email = email
        self.wallet = 0


    def deposit(self, amount):
        self.wallet += amount


    def play(self, value):

        if(self.wallet >= value):
            loteria = Loteria(value, self)
            loteria.playGame()

        else:
            print('You need to put more money in your wallet')


class comisionJuegoEspectaculo:
    COMMIPERCENTAGE = 0.20

    def __init__(self, loteria):
        self.loteria = loteria

    def comission(self):
        loteriaValue = self.loteria.value
        comission = self.gain(loteriaValue, self.COMMIPERCENTAGE)
        return comission

    @staticmethod
    def gain(loteriaValue, percentage):
        gain = loteriaValue - (loteriaValue*percentage)
        return gain

    
class Loteria:
    probability = 0.5

    def __init__(self, value, apostador):
        self.value = value
        self.apostador = apostador

    def payMoney(self,gain):
        self.apostador.wallet += gain

    def receiveMoney(self):
        self.apostador.wallet -= self.value

    def playGame(self):
        a = random.randint(0,1)

        if(a < self.probability):
            commi = comisionJuegoEspectaculo(self)
            gain = commi.comission()
            total = gain + self.value 

            print(f'Has ganado {total}')
            self.payMoney(gain)

        else:
            print('Has perdido lo que apostaste')
            self.receiveMoney()

if __name__ == "__main__":

    #Apostador 1
    apostador1 = Apostador(1,'Juan',302,'j@gmail.com')
    apostador1.deposit(500)

    print(apostador1.wallet)

    apostador1.play(400)
    print(apostador1.wallet)

    #Apostador 2
    apostador2 = Apostador(2,'Ricardo',548,'r@gmail.com')
    apostador2.deposit(500)

    print(apostador2.wallet)

    apostador2.play(400)
    print(apostador2.wallet)




    

    
