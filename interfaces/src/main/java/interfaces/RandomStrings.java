package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomStrings implements Readable {//只要继承了readable接口，便可以作为Scanner的参数，继承readable需要重写read方法。
    private static Random rand = new Random(47);
    private static final char[] CAPITALS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERS =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] VOWELS =
            "aeiou".toCharArray();
    private int count;
    public RandomStrings(int count) {
        this.count = count;
    }
    @Override public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1; // Indicates end of input
        cb.append(CAPITALS[rand.nextInt(CAPITALS.length)]);
        for(int i = 0; i < 4; i++) {
            cb.append(VOWELS[rand.nextInt(VOWELS.length)]);
            cb.append(LOWERS[rand.nextInt(LOWERS.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomStrings(10));
        while(s.hasNext())
            System.out.println(s.next());
    }
}
/* Output:
Yazeruyac
Fowenucor
Goeazimom
Raeuuacio
Nuoadesiw
Hageaikux
Ruqicibui
Numasetih
Kuuuuozog
Waqizeyoy
*/
