'''
Author: Shubham Dwivedi
Created on: January 14th 2019
'''
from threading import Thread, current_thread    

# This module is for showing a way to use thread ie by functions.

def display():

    print(current_thread().getName())
    i = 0
    while(i<=10):
        print(i)
        i+=1

print(current_thread().getName())

# An object of the Thread is created with the function assigned to it.
t = Thread(target=display)

t.start()
