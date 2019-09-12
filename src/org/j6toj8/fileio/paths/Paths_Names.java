package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Names {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome + "\n");

    Path path = Paths.get(userHome, "files", "file.txt");
    int nameCount = path.getNameCount(); // number of elements in Path
    for (int i = 0; i < nameCount; i++) {
      Path name = path.getName(i);// retrieve the specific element
      System.out.println(name); 
    }
    // end::code[]
  }

}
