'''
Author: Shubham Dwivedi
Created on: January 15th 2019
'''
from threading import Thread, Condition
from time import sleep

# Defining a producer class and consumer class for communication
# wait() and notify() are inside the Condition method used to pause(wait()) a thread and resumes their execution after notify() method 

class Producer:

    def __init__(self):
        self.products = []
        self.c = Condition()

    def produce(self):
        self.c.acquire()
        for i in range(1,6):
            self.products.append("Product"+ str(i))
            sleep(1)
            print("Product added.")
        self.c.notify()
        self.c.release()

class Consumer:

    def __init__(self, prod):
        self.prod = prod

    def consume(self):
        self.prod.c.acquire()
        self.prod.c.wait(timeout = 0)
        self.prod.c.release()
        print("Orders shipped.", self.prod.products)


p = Producer()
c = Consumer(p)

t1 = Thread(target=p.produce)
t2 = Thread(target=c.consume)

t1.start()
t2.start()
