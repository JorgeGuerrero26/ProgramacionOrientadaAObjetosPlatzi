package Java;

public class Uberpoll extends Car {
    String brand;
    String model;

    public Uberpoll(String license,Account driver,String brand,String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;        
    }
}
