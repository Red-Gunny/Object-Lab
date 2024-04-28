package Ch1.v3;

public class TicketOffice {
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
