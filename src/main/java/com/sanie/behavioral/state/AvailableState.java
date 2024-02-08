package com.sanie.behavioral.state;

public class AvailableState implements TicketState {
    public void reserve(Ticket ticket) {
        System.out.println("Ticket reserved.");
        ticket.setState(new ReservedState());
    }

    public void purchase(Ticket ticket) {
        System.out.println("Ticket purchased.");
        ticket.setState(new SoldState());
    }

    public void cancel(Ticket ticket) {
        System.out.println("Can't cancel. Ticket is currently available, not reserved or sold.");
    }
}