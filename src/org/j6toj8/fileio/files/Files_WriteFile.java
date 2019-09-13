package org.j6toj8.fileio.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Files_WriteFile {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Using a random file name, just for example to run countless times without problems
    String randomName = "file" + new Random().nextInt() + ".txt";
    
    Path path = Paths.get(userHome, randomName);
    System.out.println("Path: " + path);
    try {
      System.out.println("Path exist? " + Files.exists(path));
      Files.createFile(path);
      System.out.println("Path exist? " + Files.exists(path));
    } catch (IOException e1) {
      e1.printStackTrace();
    }

    try (BufferedWriter bw = Files.newBufferedWriter(path)) {
      bw.write("1");
      bw.write("2");
      bw.write("3");
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try (BufferedReader br = Files.newBufferedReader(path)) {
      String line = br.readLine();
      do {
        System.out.println(line);
      } while (br.readLine() != null);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
