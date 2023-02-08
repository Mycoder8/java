public class Vehile {
    static class Car {

        static Car instance = null;

        // private constructor
	    private Car() {}

        static public Car getInstance(){
            if(instance == null){
                instance = new Car();
            }

            return instance;
	    }

        public void displayInfo(){
            System.out.println("Car");
        }
    }

    class Truck {
        public void displayInfo(){
            System.out.println("Truck");
        }
    }

    static class Bus {
        public void displayInfo(){
            System.out.println("Bus");
        }
    }

    class Motorcycle {
        public void displayInfo(){
            System.out.println("Motorcycle");
        }
    }
}