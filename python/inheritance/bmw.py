'''
Author: Shubham Dwivedi
Created on: January 10th 2019
'''


from abc import abstractclassmethod, ABC

class BMW(ABC):

    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def start(self):
        print("Starting the car")

    def stop(self):
        print("Stopping the car")

    @abstractclassmethod
    def drive(self):
        pass

class ThreeSeries(BMW):         # inheriting the parent class

    def __init__(self, cruiseControlEnabled, make, model, year):
        super().__init__(make, model, year)
        self.cruiseControlEnabled = cruiseControlEnabled

    def start(self):
        super().start()
        print("Button Start")

    def drive(self):
        print("Three Series is driven")

class FiveSeries(BMW):

    def __init__(self, parkingAssistantEnabled, make, model, year):
        super().__init__(make, model, year)
        self.parkingAssistantEnabled = parkingAssistantEnabled

    def drive(self):
        print("Five Series is driven")

threeSeries = ThreeSeries(True, "BMW", "329j", 2018)

print(threeSeries.cruiseControlEnabled)
print(threeSeries.make)
print(threeSeries.model)
print(threeSeries.year)

threeSeries.start()
threeSeries.stop()
