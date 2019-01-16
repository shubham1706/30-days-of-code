'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''

class Car:
    def __init__(self, make, year):
        self.make = make
        self.year = year
    
    class Engine:
        def __init__(self, number):
            self.number = number

        def start(self):
            print("Engine Started")


c1 = Car("Ferari", 2018)
c2 = c1.Engine(123)
c2.start()