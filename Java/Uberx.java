package Java;

public class Uberx extends Car {
    String brand;
    String model;

    public Uberx(String license,Account driver,String brand,String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;        
    }
}
