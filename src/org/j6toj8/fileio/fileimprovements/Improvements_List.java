package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_List {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nDirectory listing: ");
      Files.list(path)
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("\nDirectory listing, files only: ");
      Files.list(path)
        .filter(p -> Files.isRegularFile(p))
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // end::code[]
  }

}
