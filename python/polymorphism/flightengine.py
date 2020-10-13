'''
Author: Shubham Dwivedi
Created on: January 11th 2019
'''

class Flight:

    def __init__(self, engine):
        self.engine = engine
    
    def startEngine(self):
        self.engine.start()

class AirbusEngine:
    
    def start(self):
        print("Starting Airbus Engine")

class BoingEngine:

    def start(self):
        print("Starting Boing Engine")

ae = AirbusEngine()
f = Flight(ae)

f.startEngine()


be = BoingEngine()
f  = Flight(be)
f.startEngine()


