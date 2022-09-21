import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class OptionalFilter {
    static String[] elements = {
            "Foo", "", "Bar", "Baz", "Bingo"//“”空字符串也是字符串。
    };
    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }
    static void
    test(String descr, Predicate<String> pred) {
        System.out.println(" ---( " + descr + " )---");
        for(int i = 0; i <= elements.length+1; i++) {//超过数组限制会返回Optional.empty
            System.out.println(
                    testStream()
                            .skip(i)
                            .findFirst()
                            .filter(pred));
        }
    }
    public static void main(String[] args) {
        test("true", str -> true);
        test("false", str -> false);
        test("str != \"\"", str -> str != "");
        test("str.length() == 3", str -> str.length() == 3);
        test("startsWith(\"B\")",
                str -> str.startsWith("B"));
    }
}