class Punto:
    def __init__(self, x, y=0):
        self.x = x
        self.y = y

class Circulo:
    def __init__(self, radio,*args,**kwargs):
        self.radio = radio
        self.punto = Punto(*args,**kwargs)

circle = Circulo(10,[1,2,3,5],1)
print(circle.radio)
print(circle.punto.x)
print(circle.punto.y)