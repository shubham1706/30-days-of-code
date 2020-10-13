'''
Author: Shubham Dwivedi
Created on: January 4 2019
'''

# Set
s = {10,20, "Hello World", 30, 10, 20}
print(s)
print(type(s))
print("")

s.update([40,50])
print(s)
print("")

s.remove("Hello World")
print(s)
print("")


f = frozenset(s)  #  A frozen set cannot be changed at all ie. update and remove operations cannot be performed

print(f)
print(type(f))
print("")