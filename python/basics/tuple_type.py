'''
Author: Shubham Dwivedi
Created on: January 4 2019
'''

# Tuples are unmutable datatype ie. the values in them cannot be changed
tpl = (10, 20, 10, "Hi")
print(tpl)
print("")

print(tpl[3])  # Returns the element at the third index
print("")

print(tpl.count(10))  # Counts how mant times that element is there in the tuple
print("")

print(tpl.index("Hi"))   # Returns the index of the element in the tupple
print("")


lst = [10, 45]
print(type(lst))

tpl1 = tuple(lst)    # Changing the list datatype to tuple
print(type(tpl1))