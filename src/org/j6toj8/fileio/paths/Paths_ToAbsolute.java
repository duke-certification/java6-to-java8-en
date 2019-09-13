package org.j6toj8.fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToAbsolute {

  public static void main(String[] args) {
    // tag::code[]
    Path path = Paths.get("files");
    System.out.println(path);
    System.out.println("Is it absolute? " + path.isAbsolute());
    
    System.out.println();
    
    Path absolutePath = path.toAbsolutePath();
    System.out.println(absolutePath);
    System.out.println("Is it absolute? " + absolutePath.isAbsolute());
    // end::code[]
  }

}
