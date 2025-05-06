package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNight;
    private boolean isWeekend;

// Generate constructor
    public Reservation(String roomType, int numberOfNight, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNight = numberOfNight;
        this.isWeekend = isWeekend;
    }
//Derived Getter

    //  private double price; price depend on the room-type and number of night
    public double getPrice(){
        double price;
      if(roomType.equalsIgnoreCase("king")){
          price = 139.00;
      }
      else if (roomType.equalsIgnoreCase ("double")){
            price = 124.00;
      }
      else{
          price = 0.0;
        }
      if (isWeekend){
          price = price * 1.10;
      }
      return price;
    }
    public  double getReservationTotal(){
    // Reservation total also depend on the price and weekend 10%.(isWeekend = true total will be price * 0.1)
       return getPrice() * numberOfNight;

    }

//Generate getter and setter
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
