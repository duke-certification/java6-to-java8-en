package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_SameFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path1 = Paths.get(userHome, "file1.txt");
    Path path2 = Paths.get("/", "home", "rinaldo", "file1.txt");
    Path path3 = Paths.get("/home/rinaldo/file1.txt");
    Path path4 = Paths.get("/home/rinaldo/Downloads/../file1.txt");
    
    try {
      // all Paths are equal
      System.out.println("Are Path 1 and Path 2 the same? " + Files.isSameFile(path1, path2));
      System.out.println("Are Path 2 and Path 3 the same? " + Files.isSameFile(path2, path3));
      System.out.println("Are Path 3 and Path 4 the same? " + Files.isSameFile(path3, path4));
      System.out.println("Are Path 1 and Path 4 the same? " + Files.isSameFile(path1, path4));
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
