package Streams;

import java.util.stream.*;

public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3,4,5)
                .flatMap(
                        i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }
}