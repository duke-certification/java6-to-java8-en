package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Random;

public class Files_LastModified {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "file" + new Random().nextInt() + ".txt";
    
    Path path = Paths.get(userHome, randomName);
    System.out.println("Path: " + path);

    try {
      Files.createFile(path);
      System.out.println("Date Modified: " + Files.getLastModifiedTime(path));
      FileTime fileTime = FileTime.from(Instant.now().plusMillis(10000));
      Files.setLastModifiedTime(path, fileTime);
      System.out.println("Date Modified: " + Files.getLastModifiedTime(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
