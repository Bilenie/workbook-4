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
        employeeClockOut.punchIn(7.00);

        //Act
        employeeClockOut.punchOut(15.);

        //Assert=> one assertion per test

        assertEquals(8.0,employeeClockOut.getHoursWorked(), 0.01);

    }

}