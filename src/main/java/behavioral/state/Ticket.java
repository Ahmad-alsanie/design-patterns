package behavioral.state;

public class Ticket {
    private TicketState state;

    public Ticket() {
        state = new AvailableState();
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public void reserve() {
        state.reserve(this);
    }

    public void purchase() {
        state.purchase(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}

