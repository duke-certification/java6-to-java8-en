package org.j6toj8.fileio.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class WatchService_Poll {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    try (WatchService service = FileSystems.getDefault().newWatchService();) {
      path.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);

      System.out.println("Time before poll without timeout: " + LocalTime.now());
      WatchKey key1 = service.poll(); // returns immediately even if there is no event
      System.out.println("WatchKey's poll: " + key1);
      System.out.println("Time after poll without timeout: " + LocalTime.now());

      System.out.println("Time before poll with timeout: " + LocalTime.now());
      WatchKey key2 = service.poll(5, TimeUnit.SECONDS); // returns after 5 seconds even if there is no event
      System.out.println("WatchKey's poll with timeout: " + key2);
      System.out.println("Time after poll with timeout: " + LocalTime.now());
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
