package com.pluralsight;

import java.sql.SQLOutput;

public class TheApp {
    public static void main(String[] args) {
//****************************************************************************************************************
        //instantiating an object to test our room class

        Room room1 = new Room (2,139.00,false,false);
        Room room2 = new Room (2,100.00,true,true);

        //printing out the result
        // room1 is not occupied and not dirty and room2 is occupied and is dirty.

        System.out.println(" Is room 1 available? : " + room1.IsAvailable());
        System.out.println(" Is room 2 available? : " + room2.IsAvailable());
//****************************************************************************************************************
        //instantiating an object to test our reservation class

       Reservation reservationRoom1 = new Reservation("double",1,false);
        Reservation reservationRoom2 = new Reservation ("King",2,true);

        //printing out the result

        // The price of the two room

        System.out.println(" The price of room 1 ? : " + reservationRoom1.getPrice());
        System.out.println(" The price of room 2 ? : " + reservationRoom2.getPrice());

        //The total price of the two room
        System.out.println(" The total price of room 1 ? : " + reservationRoom1.getReservationTotal());
        System.out.println(" The total price of room 2 ? : " + reservationRoom2.getReservationTotal());
//****************************************************************************************************************
        //instantiating an object to test our Employee class

        Employee employeeRoom1 = new Employee(2,"Jp","Management",62.52,45);
        Employee employeeRoom2 = new Employee(1,"Bilenie","IT Department",50.60, 40);

        //printing out the result

        // get the regular hours worked.

        System.out.println(" The regular hour worked for employee1 is ? : " + employeeRoom1.getRegularHours());
        System.out.println(" The regular hour worked for employee2 is ? : " + employeeRoom2.getRegularHours());

        // get the hours/week worked.

        System.out.println(" The  hour worked of the week for employee1 is ? : " + employeeRoom1.getHoursWorked());
        System.out.println(" The hour worked of the week for employee2 is ? : " + employeeRoom2.getHoursWorked());

        // get the over time hours worked

        System.out.println(" The over time hour worked for employee1 is ? : " + employeeRoom1.getOverTimeHours());
        System.out.println(" The over time hour worked for employee2 is ? : " + employeeRoom2.getOverTimeHours());

        //get the  pay for the work.

        System.out.println(" The  pay for employee1 is ? : " + employeeRoom1.getPayRate());
        System.out.println(" The  pay for employee2 is ? : " + employeeRoom2.getPayRate());

        //get the total pay for the work.

        System.out.println(" The total pay for employee1 is ? : " + employeeRoom1.getTotalPay());
        System.out.println(" The total pay for employee2 is ? : " + employeeRoom2.getTotalPay());

        // get the department of the employees.

        System.out.println(" The department of employee1 is ? : " + employeeRoom1.getDepartment());
        System.out.println(" The department of employee2 is ? : " + employeeRoom2.getDepartment());

        // get the name of the employees.

        System.out.println(" The Name of employee1 is ? : " + employeeRoom1.getName());
        System.out.println(" The Name of employee2 is ? : " + employeeRoom2.getName());

        // get the id of the employees.

        System.out.println(" The ID of employee1 is ? : " + employeeRoom1.getId());
        System.out.println(" The ID of employee2 is ? : " + employeeRoom2.getId());






//****************************************************************************************************************



    }
}
