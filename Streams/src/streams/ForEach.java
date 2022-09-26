package streams;

import static streams.RandInts.rands;


public class ForEach {
    static final int SZ = 5;
    public static void main(String[] args) {
        rands().limit(SZ)
                .forEach(n -> System.out.format("%d ", n));//n是入参，也就是输入遍历的结果。
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));//并行操作，排序顺序并不是一致的。但是每次都是861排第一。
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
    }
}