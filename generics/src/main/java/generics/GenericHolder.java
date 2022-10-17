package generics;

public class GenericHolder<T> {//这里的类后面为什么要跟一个泛型呢？方便构造函数吗
    private T a;
    public GenericHolder() {}
    public void set(T a) { this.a = a; }
    public T get() { return a; }
    public static void main(String[] args) {
        GenericHolder<Automobile> h3 =
                new GenericHolder<Automobile>();
        h3.set(new Automobile()); // type checked
        Automobile a = h3.get(); // No cast needed
//        h3.set("Not an Automobile"); // Error
        //h3.set(1); // Error
    }
}
