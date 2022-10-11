package strings;

import java.util.stream.Stream;

public class InfiniteRecursion {
    @Override public String toString() {
        return
                " InfiniteRecursion address: " + this + "\n";//发生递归，报错
    }
    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}
