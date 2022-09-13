public class RecursiveFibonacci {
    IntCall fib;
    RecursiveFibonacci(){//构造方法，对方法进行初始化
        fib = n->n==0?0:n==1?1:fib.call(n-1)+fib.call(n-2);
    }
    int fibonacci(int n){
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(rf.fibonacci(i));
        }
    }
}
