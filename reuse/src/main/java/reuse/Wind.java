package reuse;

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting 子类可以直接被当成基类的引用进行调用

        Instrument instrument = new Wind();
        Instrument.tune(instrument);//静态方法不能用对象.方法来调用，因为不合逻辑
        // （对象需要声明才能使用，而static在对象声明之前便已经可以使用了）。应该直接用Class去调用。
    }
}
