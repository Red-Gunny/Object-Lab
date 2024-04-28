package Ch1.v2;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        /** Audience나 TicketSeller 내부에 직접 접근하지 않고 오로지 sellTo() 만 바라본다 **/
        ticketSeller.sellTo(audience);
    }
}
