package innerclasses;

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {//继承内部类
    //- InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
