package streams;

import java.util.*;
import java.util.stream.*;

public class Signal {
    private final String msg;
    public Signal(String msg) { this.msg = msg; }
    public String getMsg() { return msg; }
    @Override public String toString() {
        return "Signal(" + msg + ")";
    }
    static Random rand = new Random(47);
    public static Signal morse() {
        switch(rand.nextInt(4)) {
            case 1: return new Signal("dot");
            case 2: return new Signal("dash");
            case 3: return new Signal("Pig");
            case 4: return new Signal("Pig");
            default: return null;
        }
    }
    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse)//函数式编程，里面是Supplier
                .map(signal -> Optional.ofNullable(signal));
    }
}