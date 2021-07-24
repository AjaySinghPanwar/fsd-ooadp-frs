package com.upgrad.frs;

public class Ticket {
    public int pnr;
    public String from, to, departureDateTime, arrivalDatetime, seatNumber;
    public float price;
    public Boolean cancelled;

    public Ticket(int pnr, String from, String to, String departureDateTime, String arrivalDatetime, String seatNumber, double price){
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDatetime = arrivalDatetime;
        this.seatNumber = seatNumber;
        this.price = (float)price;
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
