package eventsmanagement;

public class SMSSupportListener {
    private static int sms_length = 160;
    private String phone_number;

    SMSSupportListener(String phone_number) {
        this.phone_number = phone_number;
    }

}