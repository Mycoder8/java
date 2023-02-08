public class Main {

    public static void main(String[] args) {
        MySingleton my = MySingleton.getInstance();

        MySingleton my2 = MySingleton.getInstance();
        my2.name = "Riya";
        
        System.out.println(my2.name);
        System.out.println(my.name);


        Database dbConnect = Database.getInstance();
        dbConnect.getConnection();

        Account acc = Account.getInstance();
        acc.accountInformation();

        // Animal.java
        Animal animal = new Animal();

        // object created of non-static class
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object created of static class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();


        // Vehicle.java
        Vehicle vehicle = new Vehicle();

        // static classes
        Vehicle.Car car = new vehicle.Car();
        car.getInstance(); // singleton
        car.displayInfo();

        Vehicle.Bus bus = new vehicle.Bus();
        bus.displayInfo();

        // non static classes
        Vehicle.Truck truck = vehicle.new Truck();
        truck.displayInfo();

        Vehicle.Motorcycle motorcycle = vehicle.new Motorcycle();
        motorcycle.displayInfo();

        // singleton
        
    }
    
}