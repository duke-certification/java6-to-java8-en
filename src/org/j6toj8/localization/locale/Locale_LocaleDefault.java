package org.j6toj8.localization.locale;

import java.io.IOException;
import java.util.Locale;

public class Locale_LocaleDefault {

  // tag::code[]
  public static void main(String[] args) throws IOException {
    System.out.println(Locale.getDefault()); // initial default changes according to your device
    Locale.setDefault(Locale.KOREA); // change the default Locale
    System.out.println(Locale.getDefault()); // ko_KR
  }
  // end::code[]
}
