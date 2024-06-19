package activities;

public class Activity6 {
    public static void main(String[] args) {
        // Create a Plane object with maxPassengers 10
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("John");
        plane.onboard("Jane");
        plane.onboard("Smith");
        plane.onboard("Anna");

        // Print take-off time
        System.out.println("Take-off time: " + plane.takeOff());

        // Print list of passengers
        System.out.println("Passengers: " + plane.getPassengers());

        // Pause execution for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane and print the landing time
        plane.land();
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}