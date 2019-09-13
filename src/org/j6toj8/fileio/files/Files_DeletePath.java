package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_DeletePath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "file" + new Random().nextInt() + ".txt";
    
    Path path = Paths.get(userHome, randomName);
    System.out.println("Path: " + path);

    try {
      System.out.println("Path exist? " + Files.exists(path));
      Files.createFile(path);
      System.out.println("Path exist? " + Files.exists(path));
      
      Files.delete(path); // try to delete Path and throw exception if it doesn't exist
      System.out.println("Path exist? " + Files.exists(path));
      
      Files.deleteIfExists(path); // try to delete the Path and do nothing if it doesn't exist
      System.out.println("Path exist? " + Files.exists(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
