'''
Author: Shubham Dwivedi 
Created on: January 13th 2019
'''

import pickle

f = open("student.dat", "rb")

# Loads or unpickle the object that we have pickled and returns the object
obj = pickle.load(f)
f.close()

obj.display()