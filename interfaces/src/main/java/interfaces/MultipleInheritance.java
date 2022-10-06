package interfaces;

interface One {
    default void first() { System.out.println("first"); }//接口的具体实现，那么派生类，不需要实现这个方法。
}

interface Two {
    default void second() {
        System.out.println("second");
    }
}

interface Three {
    default void third() { System.out.println("third"); }
}

class MI implements One, Two, Three {}

public class MultipleInheritance {
    public static void main(String[] args) {
        MI mi = new MI();
        mi.first();
        mi.second();
        mi.third();
    }
}
/* Output:
first
second
third
*/
