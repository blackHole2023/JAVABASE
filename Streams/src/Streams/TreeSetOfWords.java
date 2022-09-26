package Streams;

import java.util.*;
import java.nio.file.*;
import java.util.stream.*;

public class TreeSetOfWords {
    public static void
    main(String[] args) throws Exception {
        Set<String> words2 =
                Files.lines(Paths.get("Streams\\src\\Streams\\TreeSetOfWords.java"))
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))//flatMap区别于map，有个“平铺”的操作。lines*单词数
                        .filter(s -> !s.matches("\\d+")) // No numbers
                        .map(String::trim)
                        .filter(s -> s.length() > 2)
                        .limit(100)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(words2);
    }
}