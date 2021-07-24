package com.upgrad.frs;

public class TouristTicket {
    public String hotelAddress = "Grand Hotel, 235 Street";
    public String[] selectedTouristLocation = new String[5];

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
