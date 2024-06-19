package activities;

public class Activity7 {
    // BicycleParts interface
    interface BicycleParts {
        int gears = 0;  // Number of gears on the bicycle
        int speed = 0;  // Max speed of the bicycle
    }

    // BicycleOperations interface
    interface BicycleOperations {
        void applyBrake(int decrement);  // How much to slow down the bicycle by
        void speedUp(int increment);     // How much to speed up the bicycle by
    }

    // Base class Bicycle implementing both interfaces
    public class Bicycle implements BicycleParts, BicycleOperations {
        // Variables
        public int gears;
        public int currentSpeed;

        // Constructor
        public Bicycle(int gears, int currentSpeed) {
            this.gears = gears;
            this.currentSpeed = currentSpeed;
        }

        // Method to apply brake
        @Override
        public void applyBrake(int decrement) {
            currentSpeed -= decrement;
        }

        // Method to speed up
        @Override
        public void speedUp(int increment) {
            currentSpeed += increment;
        }

        // Method to print the bicycle description
        public void bicycleDesc() {
            System.out.println("Number of gears: " + gears);
            System.out.println("Current speed: " + currentSpeed);
        }
    }

    // Derived class MountainBike extending Bicycle
    public class MountainBike extends Bicycle {
        // Variable for seat height
        public int seatHeight;

        // Constructor
        public MountainBike(int gears, int currentSpeed, int seatHeight) {
            super(gears, currentSpeed);
            this.seatHeight = seatHeight;
        }

        // Method to set the seat height
        public void setHeight(int newHeight) {
            seatHeight = newHeight;
        }

        // Override method to print the bicycle description
        @Override
        public void bicycleDesc() {
            super.bicycleDesc();
            System.out.println("Seat height: " + seatHeight);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the enclosing class to access the inner classes
        Activity7 activity = new Activity7();

        // Create an object for the MountainBike class
        MountainBike bike = activity.new MountainBike(5, 20, 25);

        // Use the object to access the different variables and methods
        System.out.println("Initial state of the bike:");
        bike.bicycleDesc();

        bike.speedUp(10);
        System.out.println("\nAfter speeding up:");
        bike.bicycleDesc();

        bike.applyBrake(5);
        System.out.println("\nAfter applying brake:");
        bike.bicycleDesc();

        bike.setHeight(30);
        System.out.println("\nAfter setting new seat height:");
        bike.bicycleDesc();
    }
}