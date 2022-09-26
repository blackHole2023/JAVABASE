package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Generator implements Supplier<String> {
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }
    public static void main(String[] args) {
//        String word = Stream.generate(new Generator())
//                .limit(30) .collect(Collectors.joining());//下面将其拆分。
        Generator generator = new Generator();
        System.out.println(generator);//流编程需要利用函数式编程。
        Stream<String> generate = Stream.generate(generator);
        System.out.println(generate);
        Stream<String> limit = generate.limit(30);
        List<String> collect = limit.collect(Collectors.toList());
        System.out.println(collect);
    } }