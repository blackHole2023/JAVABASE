package Streams;

import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;

public class FileToWordsRegexp {
    private String all;
    public FileToWordsRegexp(String filePath)
            throws Exception {
        all = Files.lines(Paths.get(filePath))
                .skip(1) // First (comment) line
                .collect(Collectors.joining(" "));//每一行都拼接起来，用“ ”隔开。
    }
    public Stream<String> stream() {
        return Pattern
                .compile("[ .,?]+").splitAsStream(all);//正则表达式
    }
    public static void
    main(String[] args) throws Exception {
        FileToWordsRegexp fw =
                new FileToWordsRegexp("E:\\Javastudy\\GitHub\\JAVABASE\\Streams\\src\\Cheese.dat");
//        System.out.println(fw.all);
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
        fw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}