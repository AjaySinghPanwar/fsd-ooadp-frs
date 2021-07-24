package com.upgrad.frs;

public class Ticket {
    private int pnr;
    private String from, to, departureDateTime, arrivalDatetime, seatNumber;
    private float price;
    private Boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(int pnr, String from, String to, String departureDateTime, String arrivalDatetime, String seatNumber, double price, Flight flight, Passenger passenger){
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDatetime = arrivalDatetime;
        this.seatNumber = seatNumber;
        this.price = (float)price;
        this.flight = flight;
        this.passenger = passenger;
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
