package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Random;

public class Files_Owner {

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
      System.out.println(Files.getOwner(path)); // print the current owner

      // Get system service to fetch a user
      UserPrincipalLookupService service = FileSystems.getDefault().getUserPrincipalLookupService();
      // Search for user with name 'rinaldo'
      UserPrincipal userPrincipal = service.lookupPrincipalByName("rinaldo");
      
      Files.setOwner(path, userPrincipal); // change owner
      System.out.println(Files.getOwner(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
