package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
// when we run the test it should be outside the method so that we can avoid only running one test over and over again
     @Test
    public void bookRoom_should_increaseBookedSuites(){
         //Arrange
           //we need a hotel/Object to actually do the test for our variable arrangement.
         Hotel theHotel = new Hotel("POG Hotel", 10,50);

         //Act
         theHotel.bookRoom(3,true);

         //Assert=> one assertion per test
         assertEquals(7,theHotel.getAvailableSuites());

     }
//if we don't see the run close and open it again to sync the Junit/make sure our classes are in the package.
    @Test
    public void bookRoom_should_increaseBookedRooms(){
        //Arrange
        //we need a hotel to actually do the test for our variable arrangement.
        Hotel theHotel = new Hotel("POG Hotel", 10,50);

        //Act
        theHotel.bookRoom(40,false);

        //Assert
        assertEquals(10,theHotel.getAvailableRooms());

    }
    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable(){
        //Arrange
        //we need a hotel to actually do the test for our variable arrangement.
        Hotel theHotel = new Hotel("POG Hotel", 10,50);

        //Act
        boolean success = theHotel.bookRoom(11,true);

        //Assert
        assertFalse(success);

    }

    @Test
    public void bookRoom_should_returnTrueIfNoSuitesAvailable(){
        //Arrange
        //we need a hotel to actually do the test for our variable arrangement.
        Hotel theHotel = new Hotel("POG Hotel", 10,50);

        //Act
        boolean success = theHotel.bookRoom(9,true);

        //Assert
        assertTrue(success);
    }

    @Test
    public void  getName_should_returnTheHotelName(){

        //Arrange
        //we need a hotel to actually do the test for our variable arrangement.
        Hotel theHotel = new Hotel("POG Hotel", 10,50);

        //Act
        String hotelName = theHotel.getName();

        //Assert
        assertEquals("POG Hotel",hotelName);

    }

}