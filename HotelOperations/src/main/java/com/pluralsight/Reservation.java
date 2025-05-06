package com.pluralsight;

public class Reservation {

    private String roomType;
    private boolean weekend;
    private int numberOfNights;


    public Reservation(String roomType, boolean weekend, int numberOfNights) {
        this.roomType = roomType;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        numberOfNights = numberOfNights;
    }

    public double getPrice() throws Exception {
       double baseprice;
        if(roomType.equalsIgnoreCase("king")){
           baseprice = 139.00;
       } else if (roomType.equalsIgnoreCase("double")) {
            baseprice = 124.00;
            
        } else {
            throw new Exception("invalid room type");
        }

        if(this.weekend){
            baseprice *= 1.10;
        }
        
        return baseprice;
    }
    
    public  double getReservationTotal() throws Exception {
        return getPrice() * numberOfNights;
    }

}
