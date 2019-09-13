package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CreateDirectories {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random directory name, just for example to run countless times without problems
    String randomName1 = "file" + new Random().nextInt();
    String randomName2 = "file" + new Random().nextInt();
    String randomName3 = "file" + new Random().nextInt();
    
    Path path = Paths.get(userHome, randomName1, randomName2, randomName3);
    System.out.println("Path: " + path);

    try {
      Files.createDirectory(path); // WRONG METHOD, THROWS EXCEPTION
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      System.out.println("Path exist? " + Files.exists(path));
      Files.createDirectories(path);
      System.out.println("Path exist? " + Files.exists(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
