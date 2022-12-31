from dispositivos.celular import Celular
from dispositivos.almacenamientoExterno import AlmacenamientoExterno
from dispositivos.computador import Computador
from almacenamientos.ram import Ram
from almacenamientos.almacenamiento import Almacenamiento


if __name__ == '__main__':
    cel = Celular('Alejandro','Realme 8 pro',Almacenamiento(128,'SSD'))
    alm = AlmacenamientoExterno('Curso POO')
    pc = Computador('Lenovo','s330',Almacenamiento(2000,'HDD'),Ram(8,'DDR4'))

    pc.setConexion(cel)
    print(pc.getConexion())

    print("Cantidad de celulares: " + str(Celular.getCantidad()))

    print("Cantidad de almacenamientos externos: " + str(alm.getCantidad()))

    print("Cantidad de computadores: " + str(Computador._Computador_cantidad))

    print(help(Computador))
