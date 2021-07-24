package com.upgrad.frs;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String from, String to, Flight flight, Passenger passenger){
        super(from, to, flight, passenger);
        this.specialServices = specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){
        return this.specialServices;
    }

}
