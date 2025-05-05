package com.pluralsight;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;


// Generate constructor

    public Employee(int id, String name, String department, double payRate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }
// Drived getter
    public double  getTotalPay(){

    }
    public int getRegularHours(){

    }
    public int getOverTimeHours(){

    }


// Generate getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
