import java.util.*;
import java.util.stream.*;

public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(
                bubbles.stream()
                        .mapToInt(b -> b.i)//mapToInt参数是一个函数
                        .sum());

        Set<String> w = new HashSet<>(Arrays.asList(
                "It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")//lambda表达式-函数式编程
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
    }
}