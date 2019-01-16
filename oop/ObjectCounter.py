'''
Author: Shubham Dwivedi
Created on: January 9th 2019
'''

class ObjectCounter:

    count = 0

    def __init__(self):
        ObjectCounter.count +=1

    @staticmethod
    def display():
        print(ObjectCounter.count)

o1 = ObjectCounter()
o2 = ObjectCounter()

ObjectCounter.display()


