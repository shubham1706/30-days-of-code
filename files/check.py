'''
Author: Shubham Dwivedi
Created on: January 13th 2019
'''

import os, sys

if os.path.isfile('MyFile123.txt'):
    f = open("MyFile123.txt","r")
    s = f.read()
    f.close()
else:
    print("File Doesn't Exist.")
    sys.exit()