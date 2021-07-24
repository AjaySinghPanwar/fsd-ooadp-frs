package com.upgrad.frs;


public class Main {
    public static void getTicketDetails(Ticket ticket){
        System.out.println("PNR Number: " + ticket.getPnr());
    }

    public static void main(String[] args) {
        Passenger p = new Passenger("Ajay", "+919875621257", "ajaysingh@mymail.com", "CP Street", "New Delhi", "Delhi");
        System.out.println("Passenger Count: " + p.getPassengerCount());

        Flight f = new Flight();

        RegularTicket t1 = new RegularTicket("Delhi", "Chennai", f, p);
        getTicketDetails(t1);

        TouristTicket t2 = new TouristTicket("Delhi", "Andaman", f, p);
        getTicketDetails(t2);
    }
}
