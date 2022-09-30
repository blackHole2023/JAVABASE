package housekeeping;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println(
                "Constructor w/ int arg only, petalCount= "
                        + petalCount);
    }
    Flower(String ss) {
        System.out.println(
                "Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);//构造方法
        //- this(s); // Can't call two!
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("Zero-argument constructor");
    }
    void printPetalCount() {
//        this(11); // Not inside non-constructor!不在构造方法中，不能通过这种方法调用构造方法。
        Flower flower = new Flower(11);
        System.out.println(
                "petalCount = " + petalCount + " s = "+ s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}