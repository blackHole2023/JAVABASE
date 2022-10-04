package reuse;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);//会根据方法的参数类型的不同来调用子类或是基类的方法。
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
/* Output:
doh(float)
doh(char)
doh(float)
doh(Milhouse)
*/
