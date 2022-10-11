package files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void
    main(String[] args) throws Exception {
        Files.lines(Paths.get("files","src","main","java","files","PathInfo.java"))
                .skip(13)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
/* Output:
    show("RegularFile", Files.isRegularFile(p));
*/
