package com.upgrad.frs;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];

    public TouristTicket(String from, String to, Flight flight, Passenger passenger){
        super(from, to, flight, passenger);
        this.hotelAddress = "LA Meridian Hotel, Central Street";
    }

    public String getHotelAddress(){
        return this.hotelAddress;
    }

    public String [] getTouristLocation(){
        return this.selectedTouristLocation;
    }

    public void addTouristLocation(String location){
        for(int i = 0; i < selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i] == null){
                selectedTouristLocation[i] = location;
                break;
            }
        }
    }

    public void removeTouristLocation(String location){
        for(int i = 0; i < selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i].equalsIgnoreCase(location)){
                selectedTouristLocation[i] = null;
                break;
            }
        }
    }
}
