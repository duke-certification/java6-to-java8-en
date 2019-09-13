package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Recursive_SimpleFileVisitor {

  // tag::code[]
  // Simple Implementation of a SimpleFileVisitor
  static class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      // Method that will be invoked for each file found
      System.out.println("Visited file: " + file + ". Size: " + attrs.size());
      return FileVisitResult.CONTINUE; // instructs FileVisitor to continue following the file tree
    }
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);
    try {
      // Using the MyFileVisitor class to access all files in the directory and their subdirectories.
      Files.walkFileTree(path, new MyFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
