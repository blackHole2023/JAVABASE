public class TriFunctionTest {
    static int f(int i, long l, double d) { return 99; }
    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf =
                TriFunctionTest::f;
//        tf = (i, l, d) -> 12;
        Integer apply = tf.apply(1, 2l, 3d);
        System.out.println(apply);
    }
}