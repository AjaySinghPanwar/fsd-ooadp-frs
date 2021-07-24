package com.upgrad.frs;

public class Flight {
    private String flightNumber, airline;
    private int capacity;
    private int bookedSeats;

    Flight(){
        this.flightNumber = "AGTE5694TRP";
        this.airline = "Boeing597";
        this.capacity = 500;
    }

    public Boolean checkAvailability(){
        return bookedSeats != capacity;
    }

    public void incrementBookingCounter(){
        bookedSeats++;
    }

    public String getFlightDetails(){
        System.out.println("Flight Details:- ");
        return "Flight Number: " + flightNumber + "\n" + "Airline: " + airline + "\n" + "Capacity: " + capacity;
    }
}
