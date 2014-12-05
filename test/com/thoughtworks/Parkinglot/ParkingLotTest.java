package com.thoughtworks.Parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @org.junit.Test
    public void should_get_a_ticket_when_park_a_car() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car("A1000");
        Ticket ticket = parkingLot.park(car);
        assertNotNull(ticket);
    }

    @Test
    public void should_get_car_when_have_valid_ticket() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        Ticket ticket = parkingLot.park(new Car("A1000"));
        assertNotNull(parkingLot.take(ticket));

    }
}