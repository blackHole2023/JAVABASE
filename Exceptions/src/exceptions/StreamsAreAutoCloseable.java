package exceptions;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class StreamsAreAutoCloseable {
    public static void
    main(String[] args) throws IOException{
        try(
                Stream<String> in = Files.lines(
                        Paths.get("Exceptions/src/exceptions/StreamsAreAutoCloseable.java"));
                PrintWriter outfile = new PrintWriter(
                        "Exceptions/src/exceptions/Results.txt");                         // [1]
        ) {
            in.skip(6)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEachOrdered(outfile::println);
        }                                           // [2]
    }
}