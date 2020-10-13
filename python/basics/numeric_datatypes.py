"""
Author: Shubham Dwivedi
Created on: January 3rd 2019
"""

a = 30 # Integer

print("a:", a)
print("a",":",type(a))

b = 30.0 # Float

print("b:", b)
print("b", type(b))

c = 3+4j # Complex

print("c:", c)
print("c:", type(c))

d = 0B0101  # Binary way to write an integer
print("d:",d)

e = 0XFF  # Hexadecimal way to write an integer
print("e:", e)

f = 0O0101 # Octal way to write an integer
print("f:", f)

g = True

print("g:", g)
print("g:",type(g))

# Typecasting or type conversion

h = int(b)        # toInteger
print("h:", h)
print(type(h))

i = float(a)        # toFloat
print("i:", i)
print("i:", type(i))

j = bin(10)         # toBinary
print("j:", j)
print("j:", type(j))

k = hex(66)         # toHexadecimal  
print("k:", k)
print("k:", type(k))

l = oct(10)         # toOctal
print("l:", l)
print("l:", type(l))