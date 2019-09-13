package org.j6toj8.fileio.paths;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToRealPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path pathThatDoesExist = Paths.get(userHome, "file1.txt");
    Path pathThatDoesNotExist = Paths.get(userHome, "fileThatDoesNotExist.txt");
    
    try {
      Path realPath = pathThatDoesExist.toRealPath();
      System.out.println("realPath: " + realPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      pathThatDoesNotExist.toRealPath(); // THROWS EXCEPTION
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
