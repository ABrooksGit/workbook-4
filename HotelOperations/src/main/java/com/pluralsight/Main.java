package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

//        testReservation1();
        testEmployee();
//        testRoom1();


    }


    public  static void testRoom1(){

        Room rr1 = new Room(3, 100);
        System.out.println(rr1.isAvailable());
        rr1.checkIn();
        System.out.println(rr1.isAvailable());
    }


    public static void testReservation1() throws Exception {

        Reservation r1 = new Reservation("king", false, 1);
        Reservation r2 = new Reservation("double", false, 1);

        Reservation r3 = new Reservation("king", true, 1);
        Reservation r4 = new Reservation("double", true, 1);


        System.out.println(r1.getPrice());
        System.out.println(r2.getPrice());
        System.out.println(r3.getPrice());
        System.out.println(r4.getPrice());
    }


    public static void testEmployee(){

        Employee e1 = new Employee(1, "Tony" ,"Gym", 10);
//        e1.setHoursWorked(39);
//        e1.punchTimeCard(9.0);
//        e1.punchTimeCard(13.0);
//        e1.punchTimeCard(14.0);
//        e1.punchTimeCard(18.0);

        e1.punchIn();
        e1.punchOut(13);
//
//        //
//        e1.punchOut(17);
//
//
//        //
//
//        e1.punchIn(8);
//        e1.punchOut(17);
//
//        //
//
//        e1.punchIn(8);
//        e1.punchOut(17);
//
//
//        //
//        e1.punchIn(8);
//        e1.punchOut(17);
        System.out.println(e1.getTotalPay());
        System.out.println("total hours worked " + e1.getHoursWorked());


//
//        Employee e2 = new Employee(1, "Tony" ,"Gym", 10);
//        e2.setHoursWorked(40);
//        e2.punchTimeCard(14.0);
//        System.out.println(e2.getTotalPay());
//
//
//
//
//        Employee e3 = new Employee(1, "Tony" ,"Gym", 10);
//        e3.setHoursWorked(41);
//        e3.punchTimeCard(30.0);
//        System.out.println(e3.getTotalPay());
    }




}