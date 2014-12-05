package com.thoughtworks.Parkinglot;

import java.util.Iterator;
import java.util.*;

/**
 * Created by 欣 on 2014/12/4.
 */
public class ParkingBoy {
    private ParkingLot parkingLot;
    private List<ParkingLot> parkingLotList = new ArrayList<ParkingLot>();

    public void addParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        parkingLotList.add(this.parkingLot);
    }

    public Ticket parkCar(Car car) {
        return parkingLot.park(car);
    }

    public ParkingLot getFirstParkingLot(Car car) {
        Iterator<ParkingLot> it = parkingLotList.iterator();
        while (it.hasNext()) {
            parkingLot = it.next();
            if (parkingLot.hasPositon()){
                //this.parkingLot=parkingLot;
                return parkingLot;
            }
            else parkingLot = it.next();
        }
        return null;
    }

    public Car getCar(Ticket ticket) {
        return parkingLot.take(ticket);
    }
}
