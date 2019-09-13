package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Files_BasicFileAttributes {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "file.txt");
    
    try {
      BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.println("Size: " + attributes.size());
      
      System.out.println("Is it directory? " + attributes.isDirectory());
      System.out.println("Is it symbolic link? " + attributes.isSymbolicLink());
      System.out.println("Is it a common file? " + attributes.isRegularFile());
      System.out.println("Not any of the above? " + attributes.isOther());
      
      System.out.println("Creation date: " + attributes.creationTime());
      System.out.println("Last acess: " + attributes.lastAccessTime());
      System.out.println("Last Modified: " + attributes.lastModifiedTime());
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
