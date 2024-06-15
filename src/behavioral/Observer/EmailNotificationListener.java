package behavioral.Observer;

import java.io.File;

//  sends emails upon receiving notification
public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    // 'EventManager' class use this method to notify about updates happens to file object
    public void update(String eventType, File file){
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the file: " + file.getName());
    }

}
