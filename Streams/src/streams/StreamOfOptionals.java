package streams;

import java.util.*;

public class StreamOfOptionals {
    public static void main(String[] args) {
        Signal.stream()//静态方法
                .limit(10)
                .forEach(System.out::println);//重写了tostring方法
        System.out.println(" 你好---");
        Signal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}