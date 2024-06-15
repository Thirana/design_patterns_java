package behavioral.Observer;

import java.io.File;

// concrete publisher, tracked by other objects
public class Editor {

    public EventManager events;
    private File file;

    // open & save are the event types
    public Editor(){
        this.events = new EventManager("open", "save");
    }

    // open operation -> when the file opens, it shoudl send notification to its subscribers
    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }

     public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
