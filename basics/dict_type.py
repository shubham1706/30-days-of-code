'''
Author: Shubham Dwivedi
Created on: January 4rth 2019
'''

# Dictionary is a datatype containing key:value pairs

dict = {1:"Shubham", 2:"Yash", 3:"Nihit"}
print(dict)
print(type(dict))
print("")

print(dict.items())  # Prints all the items in the dictionary
print("")

print(dict.values())  # Prints all the values in the dictionary
print("")

print(dict.keys())  # Print all the keys in the dictionary
print("")

k = dict.keys()
for i in k:
    print(i)

print("")

v = dict.values()
for j in v:
    print(j)

print("")

print(dict[2])    # Specifying the key as the index, it returns the values associated the key