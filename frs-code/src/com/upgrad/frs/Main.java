package com.upgrad.frs;


public class Main {
    public static void main(String[] args) {
        Passenger p = new Passenger("Ajay", "+919875621257", "ajaysingh@mymail.com", "CP Street", "New Delhi", "Delhi");
        System.out.println("Passenger Count: " + p.getPassengerCount());

        Flight f = new Flight();
        f.getFlightDetails();
    }
}
