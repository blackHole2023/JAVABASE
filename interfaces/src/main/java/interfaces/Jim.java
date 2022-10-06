package interfaces;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2 {
    @Override public void jim() {
        Jim2.super.jim();//这里就是用jim2的方法，但是jim2是接口，不能直接调用方法，那么这个supper在这里的机制是什么呢？
    }
    public static void main(String[] args) {
        new Jim().jim();
    }
}
/* Output:
Jim2::jim
*/
