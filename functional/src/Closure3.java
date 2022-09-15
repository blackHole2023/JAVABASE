import java.util.function.*;

public class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
        // Neither x++ nor i++ will work:
//        return () -> x++ + i++;//编译报错。闭包
        return ()->i;
    }
}