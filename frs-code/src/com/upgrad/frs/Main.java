package com.upgrad.frs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Passenger p = new Passenger();
        System.out.println("Passenger Id: " + p.getId());

        Contact c = new Contact("Ajay", "+918562256569", "ajay321@mymail.com");
        System.out.println("Passenger Name: " + c.getName());
        System.out.println("Passenger Contact Number: " + c.getPhone());
        System.out.println("Passenger Email Id: " + c.getEmail());

        Address a  = new Address("Bychula Street", "Rudrapur", "Uttarakhand");
        System.out.println("Passenger's Address: " + a.getStreet() + ", " + a.getCity() + ", " + a.getState());

        Ticket t = new Ticket(456956484, "Ahemdabad", "Delhi", "21-06-2021 08:30 a.m", "21-06-2021 1:00 p.m", "14F", 2000.85);
        System.out.println("Ticket Details: ");
        System.out.println("PNR Number: "  + t.getPnr());
        System.out.println(t.getFrom() + " to " + t.getTo());
        System.out.println("Departure Date and Time: " + t.getDepartureDateTime());
        System.out.println("Departure Date and Time: " + t.getArrivalDatetime());
        System.out.println("Seat Number: " + t.getSeatNumber());
        System.out.println("Price: " + t.getPrice());

        Flight f = new Flight();
        System.out.println("Flight Details: \n" + f.getFlightDetails());

        RegularTicket r1 = new RegularTicket();
        r1.updateSpecialServices("Food Drinks and Snacks");
        System.out.println("Special Services: " + r1.getSpecialServices());

        TouristTicket t1 = new TouristTicket();
        System.out.println("Hotel Address: " + t1.getHotelAddress());

        for(int i = 0; i < 5; ++i){
            Scanner inp = new Scanner(System.in);
            String location = inp.nextLine();
            t1.addTouristLocation(location);
        }
        System.out.println(Arrays.toString(t1.selectedTouristLocation));
        t1.removeTouristLocation("C");
        System.out.println(Arrays.toString(t1.selectedTouristLocation));
    }
}
