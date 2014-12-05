package com.thoughtworks.Parkinglot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 欣 on 2014/12/4.
 */
public class ParkingLot {
    private Map<Ticket, Car> ticketCarMap = new HashMap<Ticket, Car>();
    int maxSpace;

    public ParkingLot(int maxSpace) {
        this.maxSpace = maxSpace;
    }

    public Ticket park(Car car) {
        if (hasPositon()) {
            Ticket ticket = new Ticket(car);
            ticketCarMap.put(ticket, car);
            return ticket;
        } else return null;
    }

    public Car take(Ticket ticket) {
        Car car = null;
        if (isTicket(ticket)) {
            car = ticketCarMap.get(ticket);
            ticketCarMap.remove(ticket);
        }
        return car;
    }

    protected boolean hasPositon() {
        return ticketCarMap.size() < maxSpace;
    }

    protected boolean isTicket(Ticket ticket) {
        return ticketCarMap.containsKey(ticket);
    }
}
