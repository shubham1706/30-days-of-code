'''
Author: Shubham Dwivedi
Created on: January 14th 2019
'''

from threading import Thread, current_thread

# This module is for showing a way to use thread by defining a new class.

class MyThread:

    def displayNumbers(self):
        print(current_thread().getName())
        i = 0
        while(i<=10):
            print(i)
            i+=1

# Creating multiple instances of the newly defined class
obj1 = MyThread()
obj2 = MyThread()
obj3 = MyThread()

# Creating an instance of the Thread Class
t1 = Thread(target=obj1.displayNumbers)
t1.start()

t2 = Thread(target=obj2.displayNumbers)
t2.start()

t3 = Thread(target=obj3.displayNumbers)
t3.start()