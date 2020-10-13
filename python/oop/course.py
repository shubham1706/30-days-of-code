''' 
Author: Shubham Dwivedi
Created on: January 8th 2019
'''

class Course:

    def __init__(self, name, ratings ):
        self.name = name
        self.ratings = ratings
    
    def average(self):
        numberofratings = len(self.ratings)
        average = float(sum(self.ratings)/numberofratings)
        print(average)

c1 = Course("Python", [1, 2, 3, 4, 5])

print(c1.name)
print(c1.ratings)
c1.average()
