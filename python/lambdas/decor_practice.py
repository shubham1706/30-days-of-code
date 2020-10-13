'''
Author: Shubham Dwivedi 
Created on: January 7th 2019
'''

def decorfun(fun):
    def inner(n):
        result = fun(n)
        result = result +", how are you"
        return result
    return inner

@decorfun
def hello(name):
    return "Hello " + name
    

print(hello("Shubham"))




