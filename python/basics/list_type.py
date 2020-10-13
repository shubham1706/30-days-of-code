"""
Author: Shubham Dwivedi
Created on: January 4rth 2019
"""

# A list can contain more than one datatype.
lst1 = [10, 20.5, "sup", -5, "hello"]
print(lst1)
print("")

print(lst1[2])  # Prints the element at 2nd index
print("")

print(lst1[1:4]) # List slicing

lst1.append(420)   # Adds an element at the end of the list
print(lst1)
print("")

lst1.remove("hello")  # Removes the element specified
print(lst1)
print("")

del(lst1[2])  # Deletes the element at the specified index
print(lst1)
print("")

print(max(lst1))  # Prints the element with max value
print(min(lst1))  # Prints the element with the min value
print("")


lst1.sort()
print(lst1)    # Sort the elemtents in ascending order

lst1.sort(reverse = True)
print(lst1)  # Sorts the elements in the reverse order
print("")


lst1.clear()    # Clears the list and make it empty
print(lst1)