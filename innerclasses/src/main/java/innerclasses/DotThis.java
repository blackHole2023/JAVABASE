package innerclasses;

public class DotThis {
    void f() { System.out.println("DotThis.f()"); }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;//两者的hashcode相同，说明返回的是同一个对象。
            // A plain "this" would be Inner's "this"
        }
    }
    public Inner inner() { return new Inner(); }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        System.out.println(dt.hashCode());
        DotThis.Inner dti = dt.inner();
        System.out.println(dti.outer().hashCode());//两者的hashcode相同，说明返回的是同一个对象。
        dti.outer().f();
    }
}
/* Output:
DotThis.f()
*/
