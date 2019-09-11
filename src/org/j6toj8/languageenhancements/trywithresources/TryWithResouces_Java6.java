package org.j6toj8.languageenhancements.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResouces_Java6 {

  // tag::code[]
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("file.txt");
    PrintWriter writer = null;
    try {
      writer = new PrintWriter(file);
      writer.println("Hello World!");
    } finally {
      if (writer != null) {
        writer.close(); // closing the writer manually
      }
    }
  }
  // end::code[]
}
