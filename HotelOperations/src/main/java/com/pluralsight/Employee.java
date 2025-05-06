package com.pluralsight;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double startTime;


// Generate constructor

    public Employee(int id, String name, String department, double payRate , int hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

//Custom Method
    public void punchIn(double time){
        //this tracking the start time of work.
        this.startTime = time;
        System.out.printf(" This the time Employee started work : %.2fam \n" , time);
    }
    public void punchOut(double time){
        //This calculating the total hours worked of the day and add it to hoursWorked. still have question about hoursWorked???
       double timeWorked = time - startTime ;
        this.hoursWorked += timeWorked;
        System.out.printf(" This the time that Employee stop work : %.2f pm \n and so hours worked will be : %.2f \n " , time, timeWorked );
    }

    // Drived getter
    public double  getRegularHours(){
        if(hoursWorked <= 40){
            return this.hoursWorked;}
        else{
            return 40;
        }
    }
    public double getOverTimeHours(){
        if(hoursWorked > 40){
            return this.hoursWorked - 40;
        }else{
            return 0;
        }
    }
    public double getTotalPay(){
        double regularPay = this.getRegularHours() * payRate;
        double overtimePay = this.getOverTimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
// Generate getter and setter can delete what not used later.
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }
    public int getHoursWorked() {
        return this.hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        // ???????
        this.hoursWorked = hoursWorked;
    }
    public void showHours(){
        System.out.println("hours worked is : " + hoursWorked);
    }

}
