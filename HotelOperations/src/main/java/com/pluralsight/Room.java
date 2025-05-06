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
// Custom Method
public void checkIn(){
    //if(this.isAvailable()){ this.isOccupied = true; this.isDirty = true; sout("Guest checked in.")}else{"Room is not available."}
     isOccupied = true;
     isDirty = true;
}
public void cleanRoom(){
   isDirty = false;
}
public void checkOut(){
    this.cleanRoom();
    this.isOccupied = false;
    }

//Derived getter
public boolean IsAvailable() {
    return !this.isOccupied && !this.isDirty;
}
// Generate getter and delete what not used later.

public int getNumberOfBeds() {
return this.numberOfBeds;
}

public double getPrice() {
return this.price;
}

public boolean isOccupied() {
return this.isOccupied;
}

public boolean isDirty() {
return this.isDirty;
}

    }

