package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    // when we run the test it should be outside the method so that we can avoid only running one test over and over again
    @Test
    public void room_should_availableNotOccupiedNotDirty(){
        //Arrange
        //we need a Object to actually do the test for our variable arrangement.
        Room availableRoom = new Room(1, 139,false,false);

        //Act
        boolean beAvailable = availableRoom.IsAvailable();

        //Assert=> one assertion per test
        assertTrue(beAvailable);

    }
    @Test
    public void room_should_returnFalseIfNotAvailableIsOccupiedDirty(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room availableRoom = new Room(1, 139,true,true);

        //Act
        boolean notAvailable = availableRoom.IsAvailable();

        //Assert=> one assertion per test
        assertFalse(notAvailable);

    }
    // ***************  test checkOut **************
    @Test
    public void room_should_CleanButOccupied_checkOutShouldReturnFalse(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room currentRoom = new Room(1, 139,true,false);

        //Act
        currentRoom.checkOut();

        //Assert=> one assertion per test
        assertFalse(currentRoom.isOccupied());

    }
    @Test
    public void room_should_notCleanNotOccupied_checkOutShouldReturnFalse(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room currentRoom = new Room(1, 139,false,true);

        //Act
        currentRoom.checkOut();

        //Assert=> one assertion per test
        assertFalse(currentRoom.isOccupied());

    }
    @Test
    public void room_should_CleanNotOccupied_checkOutShouldReturnTrue(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room currentRoom = new Room(1, 139,false,false);

        //Act
        currentRoom.checkOut();

        //Assert=> one assertion per test
        assertFalse(currentRoom.isOccupied());

    }
  // *************** end test checkOut **************

 // ***************  test checkIn *******************
 @Test
 public void room_should_isDirtyIsOccupied_checkInShouldReturnTrue(){
     //Arrange
     //we need a hotel/Object to actually do the test for our variable arrangement.
     Room currentRoom = new Room(1, 139,true,true);

     //Act
     currentRoom.checkIn();

     //Assert=> one assertion per test
     assertTrue(currentRoom.isOccupied());

 }    @Test
    public void room_should_notDirtyAndOccupied_checkInShouldReturnFalse(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room currentRoom = new Room(1, 139,true,false);

        //Act
        currentRoom.checkIn();

        //Assert=> one assertion per test
        assertTrue(currentRoom.isOccupied());

    }
    @Test
    public void room_should_notCleanAndIsOccupied_checkOutShouldReturnTrue(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Room currentRoom = new Room(1, 139,false,true);

        //Act
        currentRoom.checkIn();

        //Assert=> one assertion per test
        assertTrue(currentRoom.isOccupied());

    }

// ***************  test checkIn *******************
@Test
public void room_should_isDirty_cleanRoomShouldReturnFalse(){
    //Arrange
    //we need a hotel/Object to actually do the test for our variable arrangement.
    Room currentRoom = new Room(1, 139,true,true);

    //Act
    currentRoom.cleanRoom();

    //Assert=> one assertion per test
    assertFalse(currentRoom.isDirty());

}

// ***************  test cleanRoom *******************










// ***************  test cleanRoom *******************


}