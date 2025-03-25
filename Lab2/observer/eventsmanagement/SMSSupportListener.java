package eventsmanagement;

public class SMSSupportListener implements EventListener {
    private static int sms_length = 160;
    private String phone_number;

    SMSSupportListener(String phone_number) {
        this.phone_number = phone_number;
    }

    public void sms_send(String message) {
        System.out.println("Message Sending " + phone_number + " : " + message);
    }

    @Override
    public void update(String eventType, String message) {
        if (message.length() > sms_length) {
            System.out.println("Warning: SMS length is execding 160 characters please short it ");
        } else {
            sms_send(message);
        }
    }

}