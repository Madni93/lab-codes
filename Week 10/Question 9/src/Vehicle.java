class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly");
    }
}

 class Main {
    public static void main(String[] args) {
        Vehicle v;  // reference of Vehicle

        v = new Bike();  // Vehicle reference -> Bike object
        v.run();

        v = new Car();   // Vehicle reference -> Car object
        v.run();
    }
}

