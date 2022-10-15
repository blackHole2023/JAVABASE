package reflection;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Part implements Supplier<Part> {
    @Override public String toString() {
        return getClass().getSimpleName();
    }
    static List<Supplier<? extends Part>> prototypes =//<>中的是一个接口，当然，接口是get()方法的生产者。里面有所有的模型
            Arrays.asList(
                    new FuelFilter(),//是一个创建函数，当中有get方法，返回的是一个T
                    new AirFilter(),
                    new CabinAirFilter(),
                    new OilFilter(),
                    new FanBelt(),
                    new PowerSteeringBelt(),
                    new GeneratorBelt()
            );
    private static Random rand = new Random(47);
    @Override public Part get() {
        int n = rand.nextInt(prototypes.size());//nextint()会随机生成一个整数，这个整数的范围就是int类型的范围-2^31 ~ 2^31-1,
        // 但是如果在nextInt()括号中加入一个整数a那么，这个随机生成的随机数范围就变成[0,a)。
        return prototypes.get(n).get();//获得实例
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    @Override
    public FuelFilter get() { return new FuelFilter(); }
}

class AirFilter extends Filter {
    @Override
    public AirFilter get() { return new AirFilter(); }
}

class CabinAirFilter extends Filter {
    @Override public CabinAirFilter get() {
        return new CabinAirFilter();
    }
}

class OilFilter extends Filter {
    @Override
    public OilFilter get() { return new OilFilter(); }
}

class Belt extends Part {}

class FanBelt extends Belt {
    @Override
    public FanBelt get() { return new FanBelt(); }
}

class GeneratorBelt extends Belt {
    @Override public GeneratorBelt get() {
        return new GeneratorBelt();
    }
}

class PowerSteeringBelt extends Belt {
    @Override public PowerSteeringBelt get() {
        return new PowerSteeringBelt();
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        Stream.generate(new Part())//Stream.generate() 的用法，它可以把任意 Supplier<T> 用于生成 T 类型的流。
                .limit(10)//就是重复前面10次吗？
                .forEach(System.out::println);


        Part part = new Part();
        Part part1 = part.get();
        System.out.println(part1);
    }
}
/* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*/
