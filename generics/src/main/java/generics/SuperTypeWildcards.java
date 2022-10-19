package generics;// generics/SuperTypeWildcards.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {//比Apple高，只存在向上转型，某些事确定的。
    apples.add(new Apple());
    apples.add(new Jonathan());
    // apples.add(new Fruit()); // Error
  }
}
