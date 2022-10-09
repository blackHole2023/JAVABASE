package innerclasses;

public class Parcel5 {
    public Destination destination(String s) {
        final class PDestination implements Destination {//定义在方法中。
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            @Override
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
