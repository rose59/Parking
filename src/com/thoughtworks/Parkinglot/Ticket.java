package com.thoughtworks.Parkinglot;

/**
 * Created by 欣 on 2014/12/4.
 */
public class Ticket {
    private String carId;

    public Ticket(Car car) {
        this.carId = car.getCarId();
    }

    public String getId() {
        return carId;
    }
}
