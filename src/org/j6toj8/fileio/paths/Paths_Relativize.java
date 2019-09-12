package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Relativize {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    System.out.println();
    
    Path pathAbsolute1 = Paths.get(userHome, "files");
    Path pathAbsolute2 = Paths.get(userHome, "files/file1.txt");
    System.out.println("Absolute 1: " + pathAbsolute1);
    System.out.println("Absolute 2: " + pathAbsolute2);
    
    Path pathRelative1 = Paths.get("file1.txt");
    Path pathRelative2 = Paths.get("files/file1.txt");
    System.out.println("Relative 1: " + pathRelative1);
    System.out.println("Relative 2: " + pathRelative2);
    
    System.out.println("Absolute 1 + Absolute 2: " + pathAbsolute1.relativize(pathAbsolute2));
    System.out.println("Absolute 2 + Absolute 1: " + pathAbsolute2.relativize(pathAbsolute1));
    
    System.out.println("Relative 1 + Relative 2: " + pathRelative1.relativize(pathRelative2));
    System.out.println("Relative 2 + Relative 1: " + pathRelative2.relativize(pathRelative1));
    
    try {
      // Exception will be thrown as it is not possible to call relativize on types other than Path
      System.out.println("Absolute + Relative: " + pathAbsolute1.relativize(pathRelative1));
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    try {
      // Exception will be thrown as it is not possible to call relativize on types other than Path
      System.out.println("Relative + Absolute: " + pathRelative1.relativize(pathAbsolute1));
    } catch (Exception e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
