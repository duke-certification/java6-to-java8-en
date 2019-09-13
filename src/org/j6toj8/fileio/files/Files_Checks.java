package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_Checks {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    Path path1 = Paths.get(userHome, "file1.txt");
    Path path2 = Paths.get(userHome, "files");
    
    System.out.println("Path 1: " + path1);
    System.out.println("Path 2: " + path2);
    
    System.out.println("Path 1 exist? " + Files.exists(path1));
    System.out.println("Path 2 exist? " + Files.exists(path2));
    
    System.out.println("Path 1 does NOT exist? " + Files.notExists(path1));
    System.out.println("Path 2 does NOT exist? " + Files.notExists(path2));
    
    System.out.println("Is Path 1 a directory? " + Files.isDirectory(path1));
    System.out.println("Is Path 1 a common file? " + Files.isRegularFile(path1));
    System.out.println("Is Path 1 a symbolic link? " + Files.isSymbolicLink(path1));
    
    System.out.println("Application has read permission on Path 1? " + Files.isReadable(path1));
    System.out.println("Application has write permission on Path 1? " + Files.isWritable(path1));
    System.out.println("Application has execution permission on Path 1? " + Files.isExecutable(path1));

    try {
      System.out.println("How big is Path 1? " + Files.size(path1));
    } catch (IOException e1) {
      // Throw exception if file does not exist
      e1.printStackTrace();
    }
    
    try {
      System.out.println("Is Path 1 hidden? " + Files.isHidden(path1));
    } catch (IOException e) {
      // Throw exception if file does not exist
      e.printStackTrace();
    }
    
    try {
      System.out.println("Are Path 1 and Path 1 the same? " + Files.isSameFile(path1, path1));
    } catch (IOException e) {
      // Throw exception if file does not exist
      e.printStackTrace();
    }
    
    // end::code[]
  }

}
