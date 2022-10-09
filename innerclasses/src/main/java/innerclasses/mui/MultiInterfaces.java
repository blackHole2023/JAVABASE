package innerclasses.mui;

interface A {}
interface B {}

class X implements A, B {}//与下面的实现结果是等价额，都可以实现多继承。

class Y implements A {//与上面的实现结果是等价额，都可以实现多继承。
    B makeB() {
        // Anonymous inner class:
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}