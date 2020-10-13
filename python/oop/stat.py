'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''

class demo:

    major = "IT"

    def __init__(self, name, rollno):
        self.name = name
        self.rollno = rollno


d1 = demo("John", 1)
d2 = demo("Bob",2)

print(d1.major)
print(d1.name)
print(d1.rollno)
print("")
print(d2.major)
print(d2.name)
print(d2.rollno)
