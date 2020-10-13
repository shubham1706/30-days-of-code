'''
Author: Shubham Dwivedi
Created on: 14th January 2019
'''

import time, datetime

# Stores the time at which the program starts
startTime = time.perf_counter()

# Returns the epochtime which started from 1st january 1970 in linux
epochtime = time.time()
print(epochtime)

# Gives the exact current time and date
ct = time.ctime(epochtime)
print(ct)

# Gives current date and time 
dt = datetime.datetime.today()
print("Current date: {}/{}/{}".format(dt.day, dt.month, dt.year))
print("Current Time: {}:{}".format(dt.hour, dt.minute))

# Stores the programs ending time
endTime = time.perf_counter()


# Gives the total time taken by program to execute.
print("Execution Time: ",endTime-startTime)