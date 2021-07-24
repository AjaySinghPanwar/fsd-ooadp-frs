package com.upgrad.frs;

public class Passenger {
    public int id;
    private static int idCounter;

    static{
        idCounter++;
    }
    public int getId() {
        return this.id;
    }

    Passenger(){
        this.id = idCounter;
    }
}
