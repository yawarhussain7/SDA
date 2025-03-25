package eventsmanagement;

import eventsmanagement.Editor;
import eventsmanagement.EmailNotificationListener;
import eventsmanagement.LogOpenListener;
import eventsmanagement.SMSSupportListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        EventManager eventmanager = new EventManager("sms");
        SMSSupportListener sms = new SMSSupportListener("+92034384383843");

        eventmanager.subscribe("sms", sms);
        eventmanager.notify("sms", "This is short message testing");
        eventmanager.notify("sms",
                "This is exceding testing the process of using or trying something to see if it works, is suitable, obeys the rules, etc.");

    }
}