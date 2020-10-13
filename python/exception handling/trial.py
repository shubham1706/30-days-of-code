'''
Author: Shubham Dwivedi
Created on: January 12th 2019
'''

try:
    a, b = [int(x) for x in input("Enter two numbers: ").split()]
    f = open("myfile.txt", "w")
    c =a/b
    f.write("Writing %d into the file." %c)
    print(c)

except ZeroDivisionError:
    print("Division by zero is not allowed")
else:
    print("You have entered a non zero number:")
finally:
    f.close()
    print("File Closed")
