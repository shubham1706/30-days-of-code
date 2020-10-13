'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''

class Student:

    def __init__(self):
        self.__name = "Shubh"    # the name variable is made private by adding "__" before it
        self.__id = 123         # the id variable is made private by adding "__" before it
    
    def display(self):
        print(self.__name)
        print(self.__id)


o1 = Student()

o1.display()
print("")

print(o1._Student__id)  # This is called name mangling and we can access even the private attributed by it.