'''
Author: Shubham Dwivedi
Created on: January 11th 2019
'''

# Ducktyping is a way to implement polymorphism 

class Duck:
    def talk(self):
        print("Quack Quack!")

class Human:
    def talk(self):
        print("Hello World")

def callTalk(obj):
    obj.talk()

d = Duck()
callTalk(d)

h = Human()
callTalk(h)