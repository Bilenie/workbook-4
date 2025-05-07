package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    public void employee_whenPunchIn_should_trackTheStartTime(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Employee employeeClockIn = new Employee(17, "Bilenie","IT",20,40);

        //Act
        employeeClockIn.punchIn(3.00);

        //Assert=> one assertion per test
        assertEquals(3.00,employeeClockIn.getStartTime());

    }
    @Test
    public void employee_whenPunchOut_should_seeAddedToHoursWorked(){
        //Arrange
        //we need a hotel/Object to actually do the test for our variable arrangement.
        Employee employeeClockOut = new Employee(17, "Bilenie","IT",20,40);

        //Act
        employeeClockOut.punchOut(5.);

        //Assert=> one assertion per test
        assertEquals(5.0,employeeClockOut.getHoursWorked());

    }
//    @Test
//    public void employee_whenPunchOut_should_seeTheStopTime(){
//        //Arrange
//        //we need a hotel/Object to actually do the test for our variable arrangement.
//        Employee employeeClockOut = new Employee(17, "Bilenie","IT",20,40);
//        double timeStart = employeeClockOut.getStartTime();
//
//        //Act
//        employeeClockOut.punchOut(12.0.);
//
//        //Assert=> one assertion per test
//        assertEquals(5.0,employeeClockOut.);

   // }

}