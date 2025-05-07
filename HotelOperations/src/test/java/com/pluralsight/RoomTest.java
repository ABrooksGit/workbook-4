package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {



//    @Test
//    public void should_check_In_correctly(){
//        Room r1 = new Room(3 , 125);
//
//
//        r1.checkIn();
//
//        assertTrue(r1.isOccupied());
//        assertTrue(r1.isDirty());
//
//
//    }

    @Test
    public void checkIn_After_Occupancy_ShouldBeTrue(){
        Room r1 = new Room(3 , 125);


        r1.checkIn();

        assertTrue(r1.isOccupied());

    }


    @Test
    public void testCheckInWhenDirty() {
        Room r1 = new Room(3, 125);

        r1.checkIn();
        r1.checkOut();
        boolean res = r1.checkIn();
        assertTrue(res, " Room can only be checked out when room is clean");


    }

//
//    @Test
//    public void checkIn_when_occupied_check(){
//        Room r1 = new Room(3 , 125);
//
//        r1.checkIn();
//        boolean result = r1.checkIn();
//
//        assertFalse(result, "Room cannot be checked in if Room is occupied");
//
//
//    }
//


    @Test
   public void should_check_out_correctly() {
        Room r1 = new Room(3, 125);
        r1.checkIn();


        r1.checkOut();


        assertFalse(r1.isOccupied());



    }


    @Test
    public void cleanRoom_should_work_correctly() {
        Room r1 = new Room(3, 2400);

        r1.checkIn();



        r1.checkOut();



        r1.cleanRoom();



        assertFalse(r1.isDirty());


    }


}
