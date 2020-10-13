'''
Author: Shubham Dwivedi 
Created on: January 13th 2019
'''

import re

str1 = "We are just creatures with skin and bones"

# The search method returns a single matched string ie the first string it matches 
result = re.search(r'a\w\w', str1)
print(result.group())

# The findall method returns the list of the strings that are matched
result = re.findall(r'a\w\w', str1)
print(result)

# The match method checks if the pattern is at the begining of the string, if not it returns none
result = re.match(r'W\w', str1)
print(result.group())

str2 = "We are  124 just creatures with 567 skin and bones"

# The split method returns the list after spliting the string from the sequence
result = re.split(r'\d+', str2)
print(result)

# The sub method substitutes the string with the given sequence and the replacement
result = re.sub(r'and',"&", str1)
print(result)

# The quantifiers are used to tell us how many more characters we need in a pattern to be searched


# '+' quantifier means one or more characters of the sequence
result = re.findall(r'a\w+', str1)
print(result)

# '*' quantifer means zero or more characters in the sequence
result = re.findall(r'a\w*', str1)
print(result)

# '?' quantifer means zero or one characters in the sequence
result = re.findall(r'a\w?', str1)
print(result)

# {m} quantifer can be used to specify exact number of occurences in the sequence
result = re.findall(r'a\w{2}', str1)
print(result)

# {m,n} quantifer can be used to specify the lower limit and upper limit of the sequence
result = re.findall(r'a\w{1,2}', str1)
print(result)

str3 = " My date of birth is: 22/6/1998"

result = re.findall(r'\d{1,2}/\d{1,2}/\d{4}', str3)
print(result)

# "^" symbol is used to specify if the sequence is at the begining of the string, else returns none

result = re.search(r'^W\w*', str1)
print(result.group())