'''
Author: Shubham Dwivedi
Created on: January 8th 2019
'''

class product:

    # This is a constructor defined and also default values will be used here.
    def __init__(self):
        self.name = "Iphone"
        self.description = "This phone is very expensive"
        self.price = 90000

    def display(self):
        print(self.name)
        print(self.description)
        print(self.price)


# An object is created of the class and we use different methods of the class then.
p1 = product()

print(p1.name)
print(p1.description)
print(p1.price)


p1.display()