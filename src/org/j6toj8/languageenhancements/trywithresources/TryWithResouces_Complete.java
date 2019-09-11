package org.j6toj8.languageenhancements.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class TryWithResouces_Complete {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    // creates 2 files
    File file = new File("file.txt");
    File file2 = new File("file2.txt");
    
    // try-with-resources example with PrintWriter
    try (PrintWriter writer = new PrintWriter(file)) {
      // write to file.txt
      writer.println("Hello World!");
    }
    
    // try-with-resources example with BufferedReader
    try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
      // print a line from file.txt to the console
      System.out.println(reader.readLine());
    }
    
    // try-with-resources example with BufferedReader and BufferedWriter
    try (BufferedReader reader = Files.newBufferedReader(file.toPath());
       BufferedWriter writer = Files.newBufferedWriter(file2.toPath())) {
      // read line from file.txt and write to file2.txt
      writer.write(reader.readLine() + "2");
    }
    
    // try-with-resources example with BufferedReader
    try (BufferedReader reader = Files.newBufferedReader(file2.toPath())) {
      // print a line from file2.txt to the console
      System.out.println(reader.readLine());
    }
    // all Reader and Writer have already been closed
  }
  // end::code[]
}
