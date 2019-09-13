package org.j6toj8.fileio.fileimprovements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Improvements_Find {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    try {
      System.out.println("\nAll files, skipping directories, up to the second level: ");
      // when calling find:
      // first argument: the initial path
      // second argument: the depth limit
      // third argument: lambda expression to filter
      Files.find(path, 2, (p, a) -> a.isRegularFile())
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
