package streams;

import java.util.stream.*;
import java.util.function.*;

interface Matcher extends
        BiPredicate<Stream<Integer>, Predicate<Integer>> {}

public class Matching {
    static void show(Matcher match, int val) {
        System.out.println(
                match.test(
                        IntStream.rangeClosed(1, 9)
                                .boxed()
                                .peek(n -> System.out.format("%d ", n)),//peek() 用来展示在测试短路之前测试进行到了哪一步。
                        n -> n < val));
    }
    public static void main(String[] args) {
        show(Stream::allMatch, 10);//全部为true，所以是match
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);
    }
}