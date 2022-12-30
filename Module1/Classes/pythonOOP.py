class Main():
    def __init__(self):
        employee1 = Employee("Jacob","Elordi",5000)
        print(employee1.fullname())


class Employee:

    def __init__(self,name,lastName,pay):
        self.name = name
        self.lastName = lastName
        self.pay = pay

    def fullname(self):
        return f'{self.name} {self.lastName}'

if __name__ == "__main__":
    Main()