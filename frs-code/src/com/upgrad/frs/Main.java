package com.upgrad.frs;


import java.text.ParseException;

public class Main {
    public static void getTicketDetails(Ticket ticket){
        System.out.println("PNR Number: " + ticket.getPnr());
    }

    public static void main(String[] args) throws ParseException {
        Passenger p1 = new Passenger("Ajay", "+919875621257", "ajaysingh@mymail.com", "CP Street", "New Delhi", "Delhi");
        System.out.println("Passenger Count: " + p1.getPassengerCount());

        Flight f = new Flight();
        System.out.println(f.getFlightDetails());

        RegularTicket t1 = new RegularTicket("Delhi", "Chennai", f, p1);
        getTicketDetails(t1);
        System.out.println("Flight Duration : " + t1.getFlightDuration());

        
        Passenger p2 = new Passenger("Raman", "+918965621257", "ramansangha@mymail.com", "Ludo Street", "New Delhi", "Delhi");
        System.out.println("Passenger Count: " + p2.getPassengerCount());

        TouristTicket t2 = new TouristTicket("Delhi", "Andaman", f, p2);
        getTicketDetails(t2);
        System.out.println("Flight Duration : " + t2.getFlightDuration());
    }
}
