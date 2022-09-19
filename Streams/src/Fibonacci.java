import java.util.List;
import java.util.stream.*;

public class Fibonacci {
    int x = 1;
    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }
    public static void main(String[] args) {
        List<Integer> collect = new Fibonacci().numbers()
                .skip(20) // Don't use the first 20
                .limit(10) // Then take 10 of them
                .collect(Collectors.toList());
        System.out.println(collect);;
    }
}