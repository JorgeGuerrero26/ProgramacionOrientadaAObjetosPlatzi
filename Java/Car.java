package Java;

class Car {
    Integer id;
    String liscense;
    Account driver;
    Integer passegenger;   

    public Car(String license, Account driver){
        this.liscense = license;
        this.driver = driver;
    }
    
    void printDataCar(){
        System.out.println("Liscense: " + liscense + " Name Driver: " + driver.name);
    }
}
