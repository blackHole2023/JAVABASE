package polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");//，然而 private 方法可以当作是 final 的，对于派生
//        类来说是隐蔽的。因此，这里 Derived 的 f() 是一个全新的方法；因为基类版本的 f()
//        屏蔽了 Derived ，因此它都不算是重写方法。
    }
//    public void f() {
//        System.out.println("private f()");
//    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() { System.out.println("public f()"); }
}
/* Output:
private f()
*/