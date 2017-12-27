package boardingpass;

public class JetBoardingPass implements BoardingPass {
    private String passengerFirstName;
    private String passengerLastName;
    private long ticketCode;

    public JetBoardingPass(String passengerFirstName, String passengerLastName, long ticketCode) {
        this.passengerFirstName = passengerFirstName;
        this.passengerLastName = passengerLastName;
        this.ticketCode = ticketCode;
    }

    @Override
    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    @Override
    public String getPassengerLastName() {
        return passengerLastName;
    }

    @Override
    public long getTicketCode() {
        return ticketCode;
    }
}
