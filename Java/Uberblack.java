package Java;

import java.util.ArrayList;
import java.util.Map;

public class Uberblack extends Car {
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public Uberblack(String license,Account driver,String brand,String model  , Map<String,Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial ){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;        
    }
}
