'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''

class Student:
    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name

    def setId(self, id):
        self.id = id

    def getId(self):
        return self.id

o1 = Student()
o1.setId(123)
o1.setName("Shubh")

print(o1.getId())
print(o1.getName())

