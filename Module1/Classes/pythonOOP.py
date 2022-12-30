class Main:

    def __init__(self):
        person1 = Person('Loki',16,'Old Norse','M','Icelandic')

        person1.greeting()


class Person:

    def __init__(self,name,age,language,gender,nationality):
        self.name = name
        self.age = age
        self.language = language
        self.gender = gender
        self.nationality = nationality

            
    def greeting(self):
        print(f"Hello! My name is {self.name}")


if __name__ == '__main__':
    Main()