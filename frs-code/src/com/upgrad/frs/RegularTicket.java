package com.upgrad.frs;

public class RegularTicket {
    private String specialServices;

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
    public String getSpecialServices(){
        return this.specialServices;
    }
}
