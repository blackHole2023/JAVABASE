import java.util.*;
import java.util.stream.*;

class OptionalBasics {
    static void test(Optional<String> optString) {
        if(optString.isPresent())//isPresent()检查是否包含元素。
            System.out.println(optString.get());
        else
            System.out.println("Nothing inside!");
    }
    public static void main(String[] args) {
        test(Stream.of("Epithets").findFirst());
        test(Stream.<String>empty().findFirst());
    }
}