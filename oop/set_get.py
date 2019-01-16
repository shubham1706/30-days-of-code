'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''
class Fun:

    def setName(self, n):
        self.name = n

    def getName(self):
        return self.name

    def setCourse(self, cour):
        self.course = cour
    
    def getCourse(self):
        return self.course


f1 = Fun()

f1.setName("Shubham")
f1.setCourse("Python")

print(f1.getName())
print(f1.getCourse())
