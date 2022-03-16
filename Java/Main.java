package Java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("AMQ123",new Account("Andres Herrera","AND123")); 
        car.setPassegenger(4); 
        car.printDataCar();

        UberVan uberVan =  new UberVan("FGH345", new Account("Andres Herrera","AND123"));
        uberVan.setPassegenger(6);
        uberVan.printDataCar();





    }
}