package interfaces;

public class AnImplementation implements AnInterface {
//    @Override//不用override也不会报错。
    public void firstMethod() {
        System.out.println("firstMethod");
    }
//    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }
    public static void main(String[] args) {
        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}
/* Output:
firstMethod
secondMethod
*/
