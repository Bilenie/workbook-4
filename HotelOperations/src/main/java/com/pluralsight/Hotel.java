package com.pluralsight;

public class Hotel {
    private String name; //kings or double
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    //bookedSuites => this depend on the numberOfSuites avail.
    //bookedBasicRooms => this depend on the numberOfRooms avail.

    // two kind of constructor
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // custom method
//if(this.isAvailable()){ this.isOccupied = true; this.isDirty = true; sout("Guest checked in.")}else{"Room is not available."}
// Booking method
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            int availableSuites = getAvailableSuites();
            if (numberOfRooms <= availableSuites) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            int availableBasicRooms = getAvailableRooms();
            if (numberOfRooms <= availableBasicRooms) {
                bookedBasicRooms += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }

    // Derived Getters (calculated, no private backing variables)
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

//Getter

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
