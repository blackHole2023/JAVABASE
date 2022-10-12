package strings;

import java.util.stream.Stream;

public class IntegerMatch {
    public static void main(String[] args) {
        String possiblyMinus = "-?\\d+";
        Stream.of(
                "-1234".matches(possiblyMinus),
                "5678".matches(possiblyMinus),
                "+911".matches(possiblyMinus),
                "+911".matches("(-|\\+)?\\d+")
        ).forEach(System.out::println);
    }
}
/* Output:
true
true
false
true
*/
