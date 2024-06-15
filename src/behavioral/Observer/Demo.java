package behavioral.Observer;

// Initialization code
public class Demo {

    public static void main(String[] args){

        // inside the Editor() constructor we also execute EventManager() constructor
        Editor editor = new Editor();

        // create 2 listener objects and add those to event manager
         editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

         try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
