package activities;

public class Activity1 {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car();
        
        // Set car properties
        myCar.color = "Red";
        myCar.transmission = "Manual";
        myCar.make = 2021;

        // Display car characteristics
        myCar.displayCharacteristics();
        
        // Accelerate and brake the car
        myCar.accelerate();
        myCar.brake();
    }
}