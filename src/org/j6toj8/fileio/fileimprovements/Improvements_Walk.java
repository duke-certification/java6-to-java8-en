package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_Walk {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nAll files and directories: ");
      Files.walk(path) // creates a stream
        .forEach(System.out::println); // prints on console
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("\nThe first 5 files and directories: ");
      Files.walk(path)
        .limit(5)
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // end::code[]
  }

}
