package com.pluralsight;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;


// Generate constructor

    public Employee(int id, String name, String department, double payRate , int hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
// Drived getter
    public double  getRegularHours(){
        if(hoursWorked <= 40){
            return hoursWorked;}
        else{
            return 40;
        }
    }
    public int getOverTimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else{
            return 0;
        }
    }
    public int getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOverTimeHours() * payRate * 1.5;
        return (int) (regularPay + overtimePay);
    }
// Generate getter and setter can delete what not used later.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        // ???????
        this.hoursWorked = hoursWorked;
    }
    public void showHours(){
        System.out.println("hours worked is : " + hoursWorked);
    }

}
