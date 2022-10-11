package files;

import java.nio.file.*;

public class ListOfLines {
    public static void
    main(String[] args) throws Exception {
        Files.readAllLines(
                Paths.get("Streams\\src\\streams\\Cheese.dat"))
                .stream()
                .filter(line -> !line.startsWith("//"))
                .map(line ->
                        line.substring(0, line.length()/2))
                .forEach(System.out::println);
    }
}
/* Output:
Not much of a cheese
Finest in the
And what leads you
Well, it's
It's certainly uncon
*/
