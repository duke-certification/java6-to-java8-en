package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_Lines {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files", "subfolder1", "file11.txt");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nFile content: ");
      Files.lines(path) // retrieves all file lines as Stream
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("\nFile contents greater than 2: ");
      Files.lines(path)
        .filter(s -> Integer.parseInt(s) > 2) // filters greater than 2
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
