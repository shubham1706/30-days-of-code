'''
Author: Shubham Dwivedi 
Created on: January 13th 2019
'''

import pickle, student

# opening a file
f = open("student.dat", "wb")

# Creating an object of student class
s = student.Student(17, "Shubh", 100)

# Dumping the object by using pickle
pickle.dump(s, f)

f.close()