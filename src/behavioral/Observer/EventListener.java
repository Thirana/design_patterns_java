package behavioral.Observer;

import java.io.File;

// common interface for observer
public interface EventListener {

    // any event happen to a file object
    void update(String eventType, File file);

}
