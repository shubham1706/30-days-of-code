'''
Author: Shubham Dwivedi
Created on: January 7th 2019
'''
from functools import reduce

lst1 = [1, 2, 398, 239]
y = 0

r = reduce(lambda x,y: x+y, lst1)

print(r)