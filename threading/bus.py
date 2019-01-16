'''
Author: Shubham Dwivedi
Created on: January 15th 2019
'''

from threading import Thread, Lock

# Defining a class for booking buses
class Bookmybus:

    # Defining the constructor with the available seats
    def __init__(self, availableSeats):
        self.availableSeats = availableSeats
        self.l = Lock()  # Lock is the method from the threading class used for locking a thread to an object or funct etc.
    
    # Checks if the number of seats are available or not
    def buy(self, requestedSeats):
        self.l.acquire()

        print("Total seats available.", self.availableSeats)

        if(self.availableSeats>=requestedSeats):
            print("Confirming a seat. ")
            print("Processing the payment.")
            print("Printing the ticket.")
            print("")
            self.availableSeats-= requestedSeats
        else:
            print("Sorry no seats available.")

        self.l.release() 

# Defining the objects
obj = Bookmybus(10)


# Creating Threads
t1 = Thread(target= obj.buy, args=(3,))
t2 = Thread(target= obj.buy, args=(4,))
t3 = Thread(target= obj.buy, args=(5,))

# Starting the Threads
t1.start()
t2.start()
t3.start()
