package com.pluralsight;


import java.time.LocalDateTime;


public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double startTime; //added this attribute
//    private LocalDateTime currentDateTime = LocalDateTime.now();



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
        //this tracking the start time of work. at some point time divide by 16.
        this.startTime = time;
        System.out.printf(" This the time Employee started work : %.2fam \n" , time);
    }
    public void punchOut(double time){
        //validation for the time
        if (startTime == -1) {
            System.out.println("Error: You must punch in first.");
            return;
        }
        //This calculating the total hours worked of the day and add it to hoursWorked. still have question about hoursWorked???
       double timeWorked = time - this.startTime ;
        this.hoursWorked += timeWorked;
        System.out.printf(" This the time that Employee stop work : %.2f pm \n and so hours worked will be : %.2f \n " , time, timeWorked );
    }
    //Overloaded Method for punchIn and punchOut.

    public void punchIn(){
        LocalDateTime currentDateTime = LocalDateTime.now();
      //get the current time  what hour and minute the employee clocked in.
        double timeClockedIn = currentDateTime.getHour();
        double minuteClockedIn = currentDateTime.getMinute()/60.00;
        double hourMinute = timeClockedIn + minuteClockedIn;
        startTime = hourMinute;

        System.out.printf("This the time Employee %s started work : %.2fam \n", name , hourMinute);

    }
    public void punchOut() {
        LocalDateTime currentDateTime = LocalDateTime.now();//.plusMinutes(1)(gap added)
        //get the current time  what hour and minute the employee clocked out.
        double timeClockedIn = currentDateTime.getHour();
        double minuteClockedIn = currentDateTime.getMinute()/60.;//make it decimal the divisor need to be the same format as the data type the quotient we are trying to retrieve.
        double hourMinute = timeClockedIn + minuteClockedIn;

        if (startTime == -1) {
            System.out.println("Error: You must punch in first.");
            return;
        }
        double timeWorked = hourMinute - this.startTime ;
        this.hoursWorked += timeWorked;
        System.out.printf(" This the time that Employee %s \n stop work : %.2f pm \n and so hours worked will be : %.2f \n ", name, hourMinute, timeWorked );
            //this.punchOut(hourMinute );
    }
    //telling it to punch me in and punch me out.
    public void punchTimeCard(double time, boolean isPunchIn){
        if(isPunchIn){
            this.punchIn(time);
        }
        else{
            this.punchOut(time);
        }
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
