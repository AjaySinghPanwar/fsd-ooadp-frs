package com.upgrad.frs;

public abstract class Ticket {
    private int pnr;
    private static int count = 56451216;
    private String from, to, departureDateTime, arrivalDatetime, seatNumber;
    private float price;
    private Boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String from, String to, Flight flight, Passenger passenger){
        this.pnr = count;
        count++;
        this.from = from;
        this.to = to;
        this.departureDateTime = "21 August 2021 8:30 p.m";
        this.arrivalDatetime = "22 August 2021 8.00 a.m";
        this.seatNumber = "12A";
        this.price = 2000.95f;
        this.flight = flight;
        this.passenger = passenger;
        flight.incrementBookingCounter();
        System.out.println(flight.getFlightDetails());
    }

    public int getPnr() {
        return this.pnr;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public String getDepartureDateTime() {
        return this.departureDateTime;
    }

    public String getArrivalDatetime() {
        return this.arrivalDatetime;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public float getPrice() {
        return this.price;
    }

    public int getFlightDuration(){
        return 5;
    }

    public String checkStatus(){
        if(cancelled){
            return "Ticket is cancelled";
        }
        return "Ticket is not cancelled";
    }
}
