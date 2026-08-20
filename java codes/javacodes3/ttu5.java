package javacodes3;

class Vehicle {
    void start() {
        System.out.println("The vehicle is starting...");
    }
}

// Subclass extending the superclass
class Car extends Vehicle {
    // Overriding the start method of the Vehicle class
    @Override
    void start() {
        System.out.println("The car is starting with a push button.");
    }
}

// Main class matching the file name ttu5.java
public class ttu5 {
    public static void main(String[] args) {
        // Creating an object of the superclass
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start(); // Output: The vehicle is starting...

        // Creating an object of the subclass
        Car sportsCar = new Car();
        sportsCar.start(); // Output: The car is starting with a push button.

        // Upcasting: Reference of Vehicle, Object of Car
        Vehicle myRide = new Car();
        myRide.start(); // Output: The car is starting with a push button. (Dynamic Method Dispatch)
    }
}
