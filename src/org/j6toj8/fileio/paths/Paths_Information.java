package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Information {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome + "\n");

    Path path1 = Paths.get(userHome, "files", "file.txt"); // absolute
    System.out.println("String representation: " + path1.toString());
    System.out.println("File Name: " + path1.getFileName());
    System.out.println("Top Directory: " + path1.getParent());
    System.out.println("Root Directory: " + path1.getRoot());
    System.out.println("Is it absolute?: " + path1.isAbsolute());
    
    System.out.println();
    
    Path path2 = Paths.get("home", "rinaldo", "files"); // relative
    System.out.println("String representation: " + path2.toString());
    System.out.println("File Name: " + path2.getFileName());
    System.out.println("Top Directory: " + path2.getParent());
    System.out.println("Root Directory: " + path2.getRoot());
    System.out.println("Is it absolute?: " + path2.isAbsolute());
    // end::code[]
  }

}
