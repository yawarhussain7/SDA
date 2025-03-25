package eventsmanagement;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType
                + " operation with the following file: " + message);
    }
}