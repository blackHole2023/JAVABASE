package reflection;

import reflection.interfacea.*;

class B implements A {
    @Override public void f() {}
    public void g() {}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error//如果说，接口是为了安全，不能访问，那么通过向下转型，是可以访问到子类中的方法的。
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
/* Output:
B
*/