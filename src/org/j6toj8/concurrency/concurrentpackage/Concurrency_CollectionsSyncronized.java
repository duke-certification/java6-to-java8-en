package org.j6toj8.concurrency.concurrentpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency_CollectionsSyncronized {

  public static void main(String[] args) {
    // tag::code[]
    // Concurrent Map, ensures multi-threaded access
    Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    // Common Map, DOES NOT ensures multi-threaded access
    Map<String, String> map = new HashMap<>();
        
    // Syncronized Map, ensures multi-threaded access
    Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
    // end::code[]
  }
  
}
