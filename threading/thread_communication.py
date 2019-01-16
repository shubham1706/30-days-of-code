'''
Author: Shubham Dwivedi
Created on: January 15th 2019
'''
from threading import Thread
from time import sleep

# Defining a producer class and consumer class for communication

class Producer:

    def __init__(self):
        self.products = []
        self.orderPlaced = False

    def produce(self):
        for i in range(1,6):
            self.products.append("Product"+ str(i))
            sleep(1)
            print("Product added.")
        self.orderPlaced = True

class Consumer:

    def __init__(self, prod):
        self.prod = prod

    def consume(self):
        while (self.prod.orderPlaced == False):
            sleep(0.2)
        print("Orders shipped.", self.prod.products)


p = Producer()
c = Consumer(p)

t1 = Thread(target=p.produce)
t2 = Thread(target=c.consume)

t1.start()
t2.start()
