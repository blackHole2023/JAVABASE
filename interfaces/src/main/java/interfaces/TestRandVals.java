package interfaces;

public class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);//跟类一样，直接调用接口.静态属性。
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}
/* Output:
8
-32032247016559954
-8.5939291E18
5.779976127815049
*/
