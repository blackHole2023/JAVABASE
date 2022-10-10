package collections;

public class StackCollision {
    public static void main(String[] args) {
        onjava.Stack<String> stack = new onjava.Stack<>();//这种方式也是稀奇。。。
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 =
                new java.util.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
/* Output:
fleas has dog My
fleas has dog My
*/
