package com.thoughtworks.Parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void shold_have_Id_when_get_car() throws Exception {
        Car car = new Car("A1000");
        assertNotNull(car.getCarId());

    }
}