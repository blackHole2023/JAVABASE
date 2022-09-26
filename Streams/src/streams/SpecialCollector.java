package streams;

import java.util.*;

public class SpecialCollector {
    public static void
    main(String[] args) throws Exception {
        ArrayList<String> words =
                FileToWords.stream("streams/src/Streams/Cheese.dat")
                        .collect(ArrayList::new,
                                ArrayList::add,
                                ArrayList::addAll);//可以连续进行多次操作
        words.stream()
                .filter(s -> s.equals("cheese"))
                .forEach(System.out::println);
    }
}