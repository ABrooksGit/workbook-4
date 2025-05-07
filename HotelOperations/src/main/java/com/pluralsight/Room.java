package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

//    public void setOccupied(boolean occupied) {
//        occupied = occupied;
//    }

    public boolean isDirty() {
        return dirty;
    }

//    public void setDirty(boolean dirty) {
//        this.dirty = dirty;
//    }



    public boolean isAvailable(){

        return (!this.occupied) &&(!this.dirty);

    }


    public boolean checkIn(){

        this.occupied = true;
        this.dirty = true;

//        if(!isAvailable() || dirty)/* Not available and Dirty */{
//            System.out.println("Cannot currently be checked In");
//            return;
//        }
//        occupied = true;
//        dirty = true;
//        System.out.println("Guest checked in, Room is now occupied");
        return true;
    }


    public void checkOut(){
        this.occupied = false;

//        if(!occupied){
//            System.out.println("This room is available therefore cannot be checked out");
//            return;
//        }
//        occupied = false;
//        dirty = true;

    }

    public void cleanRoom(){

        this.dirty = false;
    }


    
}
