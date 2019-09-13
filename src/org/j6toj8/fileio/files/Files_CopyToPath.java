package org.j6toj8.fileio.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_CopyToPath {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "copy" + new Random().nextInt() + ".txt";
    
    try (FileInputStream fis = new FileInputStream(userHome + File.separator + "file1.txt")) {
      Path pathToCopy = Paths.get(userHome, randomName);
      System.out.println("Path 2 exist? " + Files.exists(pathToCopy));
      Files.copy(fis, pathToCopy);
      System.out.println("Path 2 exist? " + Files.exists(pathToCopy));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
