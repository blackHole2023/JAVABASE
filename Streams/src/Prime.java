import java.util.stream.*;
import static java.util.stream.LongStream.*;

public class Prime {
    public static boolean isPrime(long n) {
        return rangeClosed(2, (long)Math.sqrt(n))//这里的2想到那个鱼i吧。。。迭代的参数，一直到输入为n。这写法实在是太高级了。
                .noneMatch(i -> n % i == 0);
    }
    public LongStream numbers() {
        return iterate(1, i -> i + 1)//迭代器，从2开始迭代，递增，filter筛选出true的元素。
                .filter(Prime::isPrime);
    }
    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)//前十个质数
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        new Prime().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }
}