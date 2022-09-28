package exceptions;

import java.util.*;
import java.nio.file.*;

public class MainException {
    // Pass exceptions to the console:
    public static void
    main(String[] args) throws Exception {
        // Open the file:
        List<String> lines = Files.readAllLines(
                Paths.get("Exceptions/src/exceptions/MainException.java"));
        // Use the file ...
    }
}