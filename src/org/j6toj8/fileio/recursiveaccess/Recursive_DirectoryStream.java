package org.j6toj8.fileio.recursiveaccess;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursive_DirectoryStream {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "files");
    System.out.println("Path: " + path);

    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
      // iteration with for-each syntax
      for (Path subPath : directoryStream) {
        System.out.println(subPath);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
      // iteration with forEach operation and lambda expression
      directoryStream.forEach(p -> System.out.println(p));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
