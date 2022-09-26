package Streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.io.*;
import java.nio.file.*;

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);
    RandomWords(String fname) throws IOException {
        List<String> lines =
                Files.readAllLines(Paths.get(fname));
        // Skip the first line:
        for(String line : lines.subList(1, lines.size())) {
            for(String word : line.split("[ .?,]+"))//断句
                words.add(word.toLowerCase());//加到words list中
        }
    }
    @Override public String get() {
        return words.get(rand.nextInt(words.size()));
    }
    @Override public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));
    }
    public static void
    main(String[] args) throws Exception {
        System.out.println(
                Stream.generate(new RandomWords("E:\\Javastudy\\GitHub\\JAVABASE\\Streams\\src\\Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" ")));
    }
}