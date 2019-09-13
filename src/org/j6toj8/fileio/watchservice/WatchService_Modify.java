package org.j6toj8.fileio.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchService_Modify {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    // WatchService creation - still not monitoring anything
    try (WatchService service = FileSystems.getDefault().newWatchService();) {

      // WatchService log in Path to monitor MODIFY event
      path.register(service, StandardWatchEventKinds.ENTRY_MODIFY);

      while (true) { // infinite loop
        // take() will return whenever there are events
        // otherwise the call is stopped waiting for events to occur
        WatchKey key = service.take();
        List<WatchEvent<?>> pollEvents = key.pollEvents(); // recovers events
        System.out.println("Events captured. Quantity: " + pollEvents.size());
        for (WatchEvent<?> event : pollEvents) { // iteration over all retrieved events
          System.out.println("Event occurred. Type: " + event.kind() + ". Context: " + event.context());
        }
        key.reset(); // resets WatchKey so that it can be used again
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
