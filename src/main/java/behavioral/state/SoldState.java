package behavioral.state;

public class SoldState implements TicketState {
    public void reserve(Ticket ticket) {
        System.out.println("Can't reserve. Ticket is already sold.");
    }

    public void purchase(Ticket ticket) {
        System.out.println("Ticket is already sold.");
    }

    public void cancel(Ticket ticket) {
        System.out.println("Can't cancel. Ticket is sold.");
    }
}