package innerclasses;

public class TestBed {
    public void f() { System.out.println("f()"); }
    public static class Tester {
        void helloWorld(){
            System.out.println("helloWorld!");
        }
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
            Tester tester = new Tester();
            tester.helloWorld();
        }
    }
}
/* Output:
f()
*/

