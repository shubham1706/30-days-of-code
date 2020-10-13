'''
Author: Shubham Dwivedi 
Created on: January 13th 2019
'''

class Student:

    def __init__(self, id, name, score):
        self.id = id
        self.name = name
        self.score = score

    def display(self):
        print(self.id, self.name, self.score)

    