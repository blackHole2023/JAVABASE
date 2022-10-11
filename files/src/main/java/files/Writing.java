package files;

import java.nio.file.*;
import java.util.List;
import java.util.Random;

public class Writing {
    static Random rand = new Random(47);
    static final int SIZE = 1000;
    public static void
    main(String[] args) throws Exception {
        // Write bytes to a file:
        byte[] bytes = new byte[SIZE];
        rand.nextBytes(bytes);
        Files.write(Paths.get("bytes.dat"), bytes);//都是以项目路径为根目录的
        System.out.println("bytes.dat: " +
                Files.size(Paths.get("bytes.dat")));

        // Write an iterable to a file:
        List<String> lines = Files.readAllLines(
                Paths.get("Streams\\src\\streams\\Cheese.dat"));
        Files.write(Paths.get("Cheese.txt"), lines);//都是以项目路径为根目录的
        System.out.println("Cheese.txt: " +
                Files.size(Paths.get("Cheese.txt")));
    }
}
/* Output:
bytes.dat: 1000
Cheese.txt: 199
*/
