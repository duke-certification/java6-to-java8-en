package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Resolve {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    System.out.println();
    
    Path path1 = Paths.get(userHome, "files");
    Path path2 = Paths.get("file1.txt");
    System.out.println("Absolute + Relative: " + path1.resolve(path2));
    System.out.println("Relative + Absolute: " + path2.resolve(path1));
    System.out.println("Absolute + Absolute: " + path1.resolve(path1));
    System.out.println("Relative + Relative: " + path2.resolve(path2));
    // end::code[]
  }

}
