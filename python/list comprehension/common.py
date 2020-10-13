'''
Author: Shubham Dwivedi
Created on: January 7th 2019
'''

lst1 = [2, 3, 87, 34, 32]
lst2 = [2, 23, 87, 34, 12, 13e]

lst3 = [i for i in lst1 if i in lst2]

print(lst3)