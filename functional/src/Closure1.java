import java.util.function.*;

public class Closure1 {
    int i;//全局变量
    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}
