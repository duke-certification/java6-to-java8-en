package org.j6toj8.fileio.paths;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Creation {

  public static void main(String[] args) {
    // tag::code[]
    // default user directory
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // absolute path
    Path path1 = Paths.get("/home/rinaldo");
    System.out.println("Path 1: " + path1);

    // absolute path divided into strings
    Path path2 = Paths.get("/", "home", "rinaldo");
    System.out.println("Path 2: " + path2);

    // absolute path from userHome
    Path path3 = Paths.get(userHome);
    System.out.println("Path 3: " + path3);

    // absolute path to a file
    Path path4 = Paths.get("/home/rinaldo/arquivos/arquivo.txt");
    System.out.println("Path 4: " + path4);

    // absolute path to a file from userHome
    Path path5 = Paths.get(userHome, "arquivos", "arquivo.txt");
    System.out.println("Path 5: " + path5);

    // absolute path on a windows system
    Path path6 = Paths.get("C:/users/rinaldo");
    System.out.println("Path 6: " + path6);

    // absolute path on a windows split into strings
    Path path7 = Paths.get("C:", "users", "rinaldo");
    System.out.println("Path 7: " + path7);

    // relative path
    Path path8 = Paths.get("rinaldo");
    System.out.println("Path 8: " + path8);

    // path from a URI
    Path path9 = Paths.get(URI.create("file:///home/rinaldo/arquivos/arquivo.txt"));
    System.out.println("Path 9: " + path9);

    // path without using the Paths class - produces the same result
    Path path10 = FileSystems.getDefault().getPath("/home/rinaldo");
    System.out.println("Path 10: " + path10);
    // end::code[]
  }

}
