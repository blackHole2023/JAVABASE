class X {
    String f() { return "X::f()"; }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
//         MakeString ms = X::f;                // [1]会报错，应为X、f非静态，得初始化，就算参数相同也会报错
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));    // [2]
        System.out.println(x.f()); // Same effect
    }
}