# ********** Basic Class Example **********
class Person:
    def __init__(self, name, birthday):  # class çaprıldığında otomatik olarak çalışacak method kullanımı böyle
        print("init metodu otomatik olarak çalıştı")
        self.name = name
        self.Age = birthday

    def intro(self):
        print(f"Hello I'am {self.name}")

    def calculateBirthYear(self):
        return 2020 - self.Age


p1 = Person(birthday=22, name="furkan")
print(f'Name: {p1.name} \nAge: {p1.Age}')
p1.intro()
print(f"I was born in {p1.calculateBirthYear()}")
# *********************************************************
