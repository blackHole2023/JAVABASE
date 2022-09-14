interface Callable {                        // [1]
    void call(String s);
}

class Describe {
    void show(String msg) {                   // [2]
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) {          // [3]
        System.out.println("Hello, " + name);
    }
    static class Description {//静态内部类
        String about;
        Description(String desc) { about = desc; }
        void help(String msg) {                 // [4]
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {//静态内部类
        static void assist(String msg) {        // [5]
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;  //[6]声明接口，后面的方法是初始化接口的方法，因为参数是一样的，所以，可以执行这样的操作
        c.call("call()");                       // [7]

        c = MethodReferences::hello;            // [8]
        c.call("Bob");

        c = new Description("valuable")::help;  // [9]
        c.call("information");

        c = Helper::assist;                     // [10]
        c.call("Help!");
    }
}