package com.upgrad.frs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight obj = new Flight();
        obj.setCapacity(500);
        obj.setAirline("Boeing");
        obj.setFlightNumber("Boeing459ATR");
        System.out.println(obj.getFlightDetails());
        System.out.println(obj.checkAvailability());
    }
}
