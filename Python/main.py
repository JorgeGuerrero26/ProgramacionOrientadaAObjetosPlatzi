from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.licese = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.liscense = "QWE567"
    car2.driver = "Matha"
    print(vars(car2))
