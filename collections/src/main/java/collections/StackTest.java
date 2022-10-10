package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);//索引会变化，后进去的反而小。。。而不是后进去的大
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");//出栈。
    }
}
/* Output:
fleas has dog My
*/
