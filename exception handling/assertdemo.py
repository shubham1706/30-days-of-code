'''
Author: Shubham Dwivedi
Created on: January 12th 2019
'''

try:
    num = int(input("Enter a number: "))
    assert num%2==0, "The input is invalid or an odd number"
except AssertionError as obj:
    print(obj)

print("After assertion error.")