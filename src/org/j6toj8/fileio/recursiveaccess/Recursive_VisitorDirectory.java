package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Recursive_VisitorDirectory {

  // tag::code[]
  static class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.println("Visited file: " + file + ". Size: " + attrs.size());
      return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
      // Action that will be performed before visiting a directory
      if (dir.getFileName().toString().equals("subfolder12")) {
        return FileVisitResult.SKIP_SUBTREE; // ignore directory subfolder12
      }
      return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
      // Action that will be performed after visiting a directory
      return FileVisitResult.CONTINUE;
    }
    
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);
    try {
      Files.walkFileTree(path, new MyFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
