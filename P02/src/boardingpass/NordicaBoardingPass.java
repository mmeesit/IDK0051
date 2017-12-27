package boardingpass;

/**
 * Created by ets on 13.09.17.
 */
public class NordicaBoardingPass implements BoardingPass {
    private String firstName;
    private String lastName;
    private long ticketCode;

    public NordicaBoardingPass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketCode = 65567;
    }

    @Override
    public String getPassengerFirstName() {
        return firstName;
    }

    @Override
    public String getPassengerLastName() {
        return lastName;
    }

    @Override
    public long getTicketCode() {
        return ticketCode;
    }
}
