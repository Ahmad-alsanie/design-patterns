package behavioral.state;

public class ReservedState implements TicketState {
    public void reserve(Ticket ticket) {
        System.out.println("Ticket is already reserved.");
    }

    public void purchase(Ticket ticket) {
        System.out.println("Ticket purchased.");
        ticket.setState(new SoldState());
    }

    public void cancel(Ticket ticket) {
        System.out.println("Reservation cancelled.");
        ticket.setState(new AvailableState());
    }
}
