package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class Recursive_VisitorOptionsAndDepth {

  // tag::code[]
  static class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      System.out.println("Visited file: " + file);
      return FileVisitResult.CONTINUE;
    }
  }
  
  public static void main(String[] args) {
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);
    try {
      HashSet<FileVisitOption> opcoes = new HashSet<FileVisitOption>();
      opcoes.add(FileVisitOption.FOLLOW_LINKS);

      // visit tree with depth limit 2 and option to also visit symbolic links
      Files.walkFileTree(path, opcoes, 2, new MyFileVisitor());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // end::code[]

}
