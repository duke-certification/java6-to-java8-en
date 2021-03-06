package org.j6toj8.fileio.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

public class WatchService_File {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files", "file1.txt"); // NOT SUPPORTED
    System.out.println("Path: " + path);

    try (WatchService service = FileSystems.getDefault().newWatchService();) {
      path.register(service, StandardWatchEventKinds.ENTRY_MODIFY); // THROWS EXCEPTION
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
