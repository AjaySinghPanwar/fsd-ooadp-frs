package com.upgrad.frs;

public class Passenger {
    private int id;
    private static int idCounter;

    private static class Contact {
        private String name, phone, email;

        public Contact(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getEmail() {
            return this.email;
        }

    }

    private Contact contact;

    private static class Address {
        private String street, state, city;

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

    private Address address;

    static{
        idCounter = 0;
    }

    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getId() {
        return this.id;
    }
    public String getAddress() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContact() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    public int getPassengerCount(){
        return idCounter;
    }
}
