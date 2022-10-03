package hiding;

class Sundae {
    private Sundae() {}//构造方法还能是private吗。。。
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //- Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}