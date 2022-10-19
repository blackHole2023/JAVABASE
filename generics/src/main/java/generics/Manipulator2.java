package generics;// generics/Manipulator2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class Manipulator2<T extends HasF> {//T也可能是HasF类
  private T obj;
  Manipulator2(T x) { obj = x; }
  public void manipulate() { obj.f(); }
}
