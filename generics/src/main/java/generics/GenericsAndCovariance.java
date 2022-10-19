package generics;// generics/GenericsAndCovariance.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance:
    List<? extends Fruit> flist = new ArrayList<>();//我猜是不确定性导致的错误，因为这个是fruit或者fruit的子类，
    // 到时候添加元素并不知道是向上还是向下转型。
//    List<Fruit> flist = new ArrayList<>();
    // Compile Error: can't add any type of object:
//     flist.add(new Apple());//对，项目也遇到这个问题了
    // flist.add(new Fruit());
    // flist.add(new Object());
    flist.add(null); // Legal but uninteresting
    // We know it returns at least Fruit:
    Fruit f = flist.get(0);
  }
}
