package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    // Private variables
    private int maxPassengers;
    private List<String> passengers;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to add passengers to the list
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers, plane is full!");
        }
    }

    // Method to get the take-off time
    public Date takeOff() {
        return new Date();
    }

    // Method to land the plane and clear the passengers list
    public void land() {
        this.lastTimeLanded = new Date();
        passengers.clear();
    }

    // Method to get the last landing time
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Method to get the list of passengers
    public List<String> getPassengers() {
        return passengers;
    }
}