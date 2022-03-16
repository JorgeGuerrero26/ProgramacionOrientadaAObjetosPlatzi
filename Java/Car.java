package Java;

class Car {
    private Integer id;
    private String liscense;
    private Account driver;
    protected Integer passegenger;   


    public Car(String license, Account driver){
        this.liscense = license;
        this.driver = driver;
    }
    
    void printDataCar(){
        System.out.println("Liscense: " + liscense + " Name Driver: " + driver.name + "Passenger: " + passegenger);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLiscense() {
        return liscense;
    }

    public void setLiscense(String liscense) {
        this.liscense = liscense;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger) {
        if (passegenger == 4) {
            this.passegenger = passegenger;    
        }else{
            System.out.println("Necesitar poner 4 pasajeros p");
        }
        
    }

    
}
