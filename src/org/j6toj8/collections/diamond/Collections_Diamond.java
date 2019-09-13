package org.j6toj8.collections.diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Diamond {

  public static void main(String[] args) {
    // tag::code[]
    List<String> l1 = new ArrayList<String>(); // without diamond
    List<String> l2 = new ArrayList<>(); // with diamond
    List<> l3 = new ArrayList<String>(); // NOT COMPILING - diamond can only be used on the right side
    
    Map<String, String> m1 = new HashMap<String, String>(); // without diamond
    Map<String, String> m2 = new HashMap<>(); // with diamond
    Map<> m3 = new HashMap<String, String>(); // NOT COMPILING - diamond can only be used on the right side

    Map<List<String>, List<String>> m4 = new HashMap<List<String>, List<String>>(); // without diamond
    Map<List<String>, List<String>> m5 = new HashMap<>(); // with diamond
    Map<List<String>, List<String>> m6 = new HashMap<<>,<>>(); // NOT COMPILING - the only valid syntax is <>
    Map<List<String>, List<String>> m7 = new HashMap<List<String>, <>>(); // NOT COMPILING - the only valid syntax is <>
    
    Map<Map<List<String>, List<String>>, Map<List<String>, List<String>>> m8 = new HashMap<>(); // with diamond
    
    Map<> m9 = new HashMap<>(); // NOT COMPILING - it's necessary to inform the type on the left side
    // end::code[]
  }
  
}
