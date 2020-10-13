'''
Author: Shubham Dwivedi
Created on: January 7th 2019
'''

lst1 = [1, 2, 3, 4 ,5]
lst2 = [5, 4, 3, 2, 1]

lst3 = [lst1[i]*lst2[i] for i in range(len(lst1)) if len(lst1)==len(lst2)]

print(lst3)