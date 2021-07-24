package com.upgrad.frs;

public class Address {
    public String street, state, city;

    public Address(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }


}
