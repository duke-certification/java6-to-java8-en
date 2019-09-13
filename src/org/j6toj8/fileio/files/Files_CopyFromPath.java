package org.j6toj8.fileio.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyFromPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "copy" + new Random().nextInt() + ".txt";
    
    try (FileOutputStream fos = new FileOutputStream(userHome + File.separator + randomName)) {
      Path pathToCopy = Paths.get(userHome, "file1.txt");
      Files.copy(pathToCopy, fos);
      
      Path createdPath = Paths.get(userHome, randomName);
      System.out.println("Created Path: " + createdPath);
      System.out.println("Created Path exist? " + Files.exists(createdPath));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
