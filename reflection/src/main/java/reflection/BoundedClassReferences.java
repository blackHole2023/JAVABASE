package reflection;

public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
//        Class<Number> numberClass = Integer.class;//编译错误
        Class<? extends Number> numberClass = Integer.class;
    }
}
