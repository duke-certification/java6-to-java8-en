package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Files_ReadAllLines {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "file.txt");
    try {
      List<String> content = Files.readAllLines(path);
      System.out.println(content);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
