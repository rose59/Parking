package com.thoughtworks.Parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {
    @Test
    public void should_get_ticket_when_have_new_car() throws Exception {
        Car car = new Car("A1000");
        Ticket ticket = new Ticket(car);
        assertNotNull(ticket.getId());

    }
}