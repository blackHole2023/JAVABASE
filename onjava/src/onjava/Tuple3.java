package onjava;

public class Tuple3<A, B, C> extends Tuple2<A, B> {
    public final C a3;
    public Tuple3(A a, B b, C c) {//构造方法中的supper，调用基类的构造方法。
        super(a, b);
        a3 = c;
    }
    @Override public String rep() {
        return super.rep() + ", " + a3;
    }
}
