'''
Author: Shubham Dwivedi
Created on: January 14th 2019
'''

from threading import Thread, current_thread

# This module is for showing a way to use thread by inheriting the Thread class.

class MyThread(Thread):
    def run(self):
        print(current_thread().getName())
        i = 0
        while(i<=10):
            print(i)
            i+=1

# Making an object of the class inheriting the Thread
t = MyThread()
t.start()
