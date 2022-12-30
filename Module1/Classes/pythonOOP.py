class Main():
    def __init__(self):
        employee1 = Employee("Jacob","Elordi",5000)
        print(employee1.fullname())

        employee2 = "Logan-Paul-6500"

        employee2 =  Employee.fromString(employee2)
        print(employee2.__dict__)
       


class Employee:
    raiseAmount = 1.04

    def __init__(self,name,lastName,pay):
        self.name = name
        self.lastName = lastName
        self.pay = pay

    def fullname(self):
        return f'{self.name} {self.lastName}'

    @classmethod
    def setRaiseAmount(cls,amount):
        cls.raiseAmount = amount

    @classmethod
    def fromString(cls,string):
        name,lastName,pay = string.split("-")
        return cls(name,lastName,pay)
        

if __name__ == "__main__":
    Main()