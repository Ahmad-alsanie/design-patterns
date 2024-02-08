package com.sanie.behavioral.state;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.reserve();  // Ticket reserved.
        ticket.cancel();   // Reservation cancelled. Ticket available.
        ticket.purchase(); // Ticket purchased.
        ticket.reserve();  // Can't reserve. Ticket is already sold.
    }
}
