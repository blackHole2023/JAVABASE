import java.util.function.*;
import java.util.stream.*;

public class PredicateComposition {
    static Predicate<String>
            p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
            p4 = p1.negate().and(p2).or(p3);
    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fongopuckey")//这又是什么高级用法。。。
                .filter(p4)//stream得好好学学。。。
                .forEach(System.out::println);
    }
}