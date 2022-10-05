package polymorphism.shape;

public class Circle extends Shape {
    @Override public void draw() {//重写shape方法。正规的话，一般用接口。
        System.out.println("Circle.draw()");
    }
    @Override public void erase() {
        System.out.println("Circle.erase()");
    }
}