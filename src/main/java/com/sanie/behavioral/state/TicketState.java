package com.sanie.behavioral.state;

public interface TicketState {
    void reserve(Ticket ticket);
    void purchase(Ticket ticket);
    void cancel(Ticket ticket);
}
