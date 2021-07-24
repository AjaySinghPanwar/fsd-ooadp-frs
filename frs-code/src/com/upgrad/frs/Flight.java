package com.upgrad.frs;

public class Flight {
    public static String flightNumber, airline;
    public static int capacity;
    private int bookedSeats;

    static {
        flightNumber = "AH56418TRP";
        airline = "Boeing";
        capacity = 500;
    }

    public Boolean checkAvailability(){
        return bookedSeats != capacity;
    }

    public void incrementBookingCounter(){
        bookedSeats++;
    }

    public String getFlightDetails(){
        return "Flight Number: " + flightNumber + ", " + "Airline: " + airline + ", " + "Capacity: " + capacity;
    }
}
