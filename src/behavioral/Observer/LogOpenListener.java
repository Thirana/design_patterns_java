package behavioral.Observer;

import java.io.File;

// writes a message to a log upon receiving notification
public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }

    @Override
    // 'EventManager' class use this method to notify about updates happens to file object
    public void update(String eventType, File file){
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }


}
