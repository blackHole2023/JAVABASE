package collections;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {//增加一个方法，返回Iterable？
        return new Iterable<T>() {//又是匿名内部类
            public Iterator<T> iterator() {//嵌套
                return new Iterator<T>() {//匿名内部类
                    int current = size() - 1;
                    @Override public boolean hasNext() {
                        return current > -1;
                    }
                    @Override
                    public T next() { return get(current--); }
                    @Override
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<>(
                        Arrays.asList("To be or not to be".split(" ")));
        // Grabs the ordinary iterator via iterator():
        for(String s : ral)
            System.out.print(s + " ");
        System.out.println();
        // Hand it the Iterable of your choice
        for(String s : ral.reversed())
            System.out.print(s + " ");
    }
}
/* Output:
To be or not to be
be to not or be To
*/
