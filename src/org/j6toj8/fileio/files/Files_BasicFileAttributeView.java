package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class Files_BasicFileAttributeView {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path = Paths.get(userHome, "file.txt");
    
    try {
      BasicFileAttributeView attributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
      BasicFileAttributes oldAttributes = attributesView.readAttributes();
      
      System.out.println("\nOriginal creation date: " + oldAttributes.creationTime());
      System.out.println("Original last access: " + oldAttributes.lastAccessTime());
      System.out.println("Original last modified: " + oldAttributes.lastModifiedTime());
      
      FileTime fileTime = FileTime.from(Instant.now().plusMillis(10000));
      attributesView.setTimes(fileTime, fileTime, fileTime);
      
      BasicFileAttributes newAttributes = attributesView.readAttributes();
      System.out.println("\nCreation date changed: " + newAttributes.creationTime());
      System.out.println("Last access changed: " + newAttributes.lastAccessTime());
      System.out.println("Last modified changed: " + newAttributes.lastModifiedTime());
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
