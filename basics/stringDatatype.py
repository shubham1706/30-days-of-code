"""
Author: Shubham Dwivedi
Created on: January 3rd 2019
"""

print(" ")


str1 = "This script is for understanding the string datatype"
str2 = """This is a multiline
        String 
        example."""

print("str1:", str1)

print("str2:", str2)

# Indexing
print(str1[0])
print(str1[1])
print(str1[2])
print(str1[3])
print(str1[4])
print("")

# Slicing
print(str1[0:4])
print(str1[5:11])
print(str1[-40:-38])
print("")

# Stepping
print(str1[0:20:2])
print(str1[::-1])       # reverses the string order
print("")

str3 = "   This script is for understanding the String datatype   "
print(str3)

# Spacing
print(str3.strip())   # Removes the spacing from both the end and the beginning.
print(str3.lstrip())  # Removes the spacing from left side.
print(str3.rstrip())  # Removes the spacing from right side.


print("s:", str1.count("s"))  # Counts the occurence of the given sequence and returns the integer value
print(str1.find("string"))    # Returns the starting index if the given sequence is found or else returns "-1"
print(str1.replace("string", "String"))     #Replaces an old string with a new one.
print("")

print(str1.upper())  # Converts all the elements to uppercase
print(str1.lower())  # COnverts all the elements to lowercase
print(str1.title())  # Converts the first elements to uppercase and rest to lowercase