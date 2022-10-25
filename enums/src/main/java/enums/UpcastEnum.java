package enums;// enums/UpcastEnum.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// No values() method if you upcast an enum

import java.util.Arrays;

enum Search { HITHER, YON }

public class UpcastEnum {
  public static void main(String[] args) {
    Search[] vals = Search.values();
    System.out.println(Arrays.toString(vals));
    Enum e = Search.HITHER; // Upcast
    System.out.println(e);
    System.out.println(e.getClass().getEnumConstants());
    // e.values(); // No values() in Enum
    for(Enum en : e.getClass().getEnumConstants())
      System.out.println(en);
  }
}
/* Output:
HITHER
YON
*/
