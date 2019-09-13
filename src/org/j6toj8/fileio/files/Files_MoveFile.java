package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_MoveFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    String randomName = "arquivo" + new Random().nextInt() + ".txt";
    
    Path sourceFile = Paths.get(userHome, randomName);
    Path destinationFile = Paths.get(userHome, randomName + "-moved.txt");
    System.out.println("Path Source File: " + sourceFile);
    System.out.println("Path Destination File: " + destinationFile);
    
    try {
      System.out.println("Source File exist? " + Files.exists(sourceFile));
      Files.createFile(sourceFile);
      System.out.println("Source File exist? " + Files.exists(sourceFile));
      
      System.out.println("Destination File exist? " + Files.exists(destinationFile));
      Files.move(sourceFile, destinationFile);
      System.out.println("Destination File exist? " + Files.exists(destinationFile));
      System.out.println("Source File exist? " + Files.exists(sourceFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
