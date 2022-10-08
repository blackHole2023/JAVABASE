package interfaces.filters;

public class Waveform {
    private static long counter;
    private final long id = counter++;//计数器
    @Override public String toString() {
        return "Waveform " + id;
    }
}
