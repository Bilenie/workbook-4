package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
//Generate constructor
public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
    this.numberOfBeds = numberOfBeds;
    this.price = price;
    this.isOccupied = isOccupied;
    this.isDirty = isDirty;
}
//Derived getter
public boolean IsAvailable() {
    return !isOccupied && !isDirty;
}
// Generate getter and setter
public int getNumberOfBeds() {
return numberOfBeds;
}

public double getPrice() {
return price;
}

public boolean isOccupied() {
return isOccupied;
}

public boolean isDirty() {
return isDirty;
}


    }

