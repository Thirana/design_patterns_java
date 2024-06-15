package behavioral.Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// basic publisher - maintain a list of events and objects which have subsribed for those events.
// this class is used by 'Editor' class
public class EventManager {
    
    // to maintain a list of events and objects which have subsribed for those events.
    Map<String, List<EventListener>> listeners = new HashMap<>();


    public EventManager(String... operations){
        for(String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }


    public void unsubscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    // file -> object that got changed
    public void notify(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);

        for (EventListener listener : users){
            listener.update(eventType, file);
        }
    }

}
