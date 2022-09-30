package housekeeping;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {//去皮
    static Apple peel(Apple apple) {
        // ... remove peel中间一系列操作
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() { return Peeler.peel(this); }//这里的this代表这个apple类。
    Apple getPeeled1() { return Peeler.peel(new Apple()); }//与上面是等价的。
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}