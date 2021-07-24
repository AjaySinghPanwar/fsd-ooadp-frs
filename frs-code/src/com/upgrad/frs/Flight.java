package com.upgrad.frs;

public class Flight {
    private String flightNumber, airline;
    private int capacity;
    private int bookedSeats;

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean checkAvailability(){
        return bookedSeats != capacity;
    }

    private void incrementBookingCounter(){
        bookedSeats++;
    }

    public String getFlightDetails(){
        return "Flight Number: " + flightNumber + ", " + "Airline: " + airline + ", " + "Capacity: " + capacity;
    }
}
