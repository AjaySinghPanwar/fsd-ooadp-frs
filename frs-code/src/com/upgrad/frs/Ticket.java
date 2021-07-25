package com.upgrad.frs;

import java.text.*;
import java.util.*;

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
        this.departureDateTime = "21 Aug 2021 20:30:00 p.m";
        this.arrivalDatetime = "22 Aug 2021 8:00:00 a.m";
        this.seatNumber = "12A";
        this.price = 2000.95f;
        this.flight = flight;
        this.passenger = passenger;
        flight.incrementBookingCounter();
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

    public String getFlightDuration() throws ParseException {
        int noOfDays = Integer.parseInt(this.arrivalDatetime.substring(0,2)) - Integer.parseInt(this.departureDateTime.substring(0,2));
        String timeArrival = this.arrivalDatetime.substring(12,21);
        String timeDeparture = this.departureDateTime.substring(12, 21);

        // Creating a SimpleDateFormat object to parse time in the format HH:MM:SS
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("HH:mm:ss");

        // Parsing the Time Period
        Date date1 = simpleDateFormat.parse(timeArrival);
        Date date2 = simpleDateFormat.parse(timeDeparture);

        // Calculating the difference in milliseconds
        long differenceInMilliSeconds
                = Math.abs(date2.getTime() - date1.getTime());

        // Calculating the difference in Hours
        long differenceInHours
                = (differenceInMilliSeconds / (60 * 60 * 1000)) % 24;

        // Calculating the difference in Minutes
        long differenceInMinutes
                = (differenceInMilliSeconds / (60 * 1000)) % 60;

        // Calculating the difference in Seconds
        long differenceInSeconds
                = (differenceInMilliSeconds / 1000) % 60;

        if(noOfDays != 0){
            return (int)differenceInHours + " Hours " + (int)differenceInMinutes + " Minutes "+ (int)differenceInSeconds + " Seconds ";
        }
        return noOfDays + " Days " + differenceInHours + " Hours " + differenceInMinutes + " Minutes "+ differenceInSeconds + " Seconds ";
    }

    public void cancelTicket(String str){
        if(str.equalsIgnoreCase("cancel")){
            cancelled = true;
        }
        cancelled = false;
    }

    public String checkStatus(){
        if(cancelled){
            return "Ticket is cancelled";
        }
        return "Ticket is not cancelled";
    }
}
