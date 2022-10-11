package strings;

import java.util.stream.Stream;

public class InfiniteRecursion {
    @Override public String toString() {
        return
//                " InfiniteRecursion address: " + this + "\n";//发生递归，报错。+会发生类型转发，调用tostring方法。
//        //发生递归，报错。+会发生类型转发，调用tostring方法。
        " InfiniteRecursion address: " + super.toString() + "\n";//正确的
    }
    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
        String s = "str";
    }
}
