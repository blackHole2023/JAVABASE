import java.util.function.*;

public class AnonymousClosure {
    IntSupplier makeFun(int x) {
        int i = 0;
        // Same rules apply:
        // i++; // Not "effectively final"
        // x++; // Ditto
        return ()->x+i;
//        return new IntSupplier() {
//            public int getAsInt() { return x + i; }
//        };
    }
}