'''
Author: Shubham Dwivedi
Created on: January 6th 2019
'''

def factorial(n):
    if(n==0):
        result = 1
    else:      
        result=n*factorial(n-1)
    return result

x = int(input("Enter a number: "))
solution = factorial(x)
print(solution)