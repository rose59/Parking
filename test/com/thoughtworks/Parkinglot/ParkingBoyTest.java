package com.thoughtworks.Parkinglot;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ParkingBoyTest {
    private ParkingBoy parkingBoy;

    @Before
    public void setUp() throws Exception {
        parkingBoy=new ParkingBoy();

    }

    @Test
    public void should_get_ticket_when_park_car_successfully() throws Exception {
        parkingBoy.addParkingLot(new ParkingLot(10));
        Ticket ticket = parkingBoy.parkCar(new Car("A1000"));
        assertNotNull(ticket);
    }

    @Test
    public void should_park_first_position_when_parking_successfully(){
        ParkingLot parkingLot1 = new ParkingLot(10);
        parkingBoy.addParkingLot(parkingLot1);
        parkingBoy.addParkingLot(new ParkingLot(10));
        ParkingLot parkingLot=parkingBoy.getFirstParkingLot(new Car("A1000"));
        assertThat(parkingLot,is(parkingLot1));
    }

    @Test
    public void shold_get_car_when_ticket_is_valid() throws Exception {
        Car car1=new Car("A1001");
    //   Car car2 = new Car("A1002");
        parkingBoy.addParkingLot(new ParkingLot(10));
        Ticket ticket=parkingBoy.parkCar(car1);
        assertThat(parkingBoy.getCar(ticket),is(car1));

    }
}