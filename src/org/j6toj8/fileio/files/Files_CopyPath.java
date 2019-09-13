package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "file" + new Random().nextInt() + ".txt";
    
    Path path1 = Paths.get(userHome, randomName);
    Path path2 = Paths.get(userHome, randomName + "-copy.txt");
    System.out.println("Path 1: " + path1);
    System.out.println("Path 2: " + path2);
    
    try {
      System.out.println("Path 1 exist? " + Files.exists(path1));
      Files.createFile(path1);
      System.out.println("Path 1 exist? " + Files.exists(path1));
      System.out.println("Path 2 exist? " + Files.exists(path2));
      Files.copy(path1, path2);
      System.out.println("Path 2 exist? " + Files.exists(path2));
    } catch (IOException e) {
      e.printStackTrace();
    }

    // end::code[]
  }

}
